parser grammar typescriptparser;

options { tokenVocab=typescriptlexer; }

// Root rule
program     : statement+;

// Statements
statement   :
             componentDeclaration
            |classDeclaration
            | interfaceDeclaration
            | methodDeclaration
            | variableDeclaration
            | importDeclaration

            ;
// Class Declaration
componentDeclaration
    : DECORATOR COMPONENT LPAREN LBRACE componentDeclarationBody RBRACE RPAREN
     ;
    componentDeclarationBody
        : (componentBodyElement COMMA? (COMMA componentBodyElement)* )?; // السماح بأكثر من عنصر مع فواصل
    componentBodyElement
        : selector
        | standalone
        | importDeclaration
        | template
        | styles;
selector :SELECTOR COLON STRING_LIT ;
standalone : STANDALONE COLON isboolean  ;
template
    : TEMPLATE COLON_HTML BACKTICK_HTML  element* END_TEMPLATE
    ;

styles :STYLES COLON_CSS OPEN_LIST cssBody CLOSE_LIST COMMA? ;




isboolean :TRUE | FALSE;


classDeclaration :
    EXPORT? CLASS ID  classDeclarationBody
    ;

classDeclarationBody
    : LBRACE (classMember SEMICOLON?)* RBRACE  // السماح بعدة أعضاء
    ;

classMember
    : methodDeclaration
    | propertyDeclaration
    ;




propertyDeclaration
    : ID COLON type ASSIGN initvalue SEMICOLON?
    | ID COLON type  (OR ID ASSIGN ID)? SEMICOLON ?

    ;

methodDeclaration
    : ID LPAREN parameterList? RPAREN COLON type? LBRACE methodBody RBRACE
    ;
methodBody :(statementMethod)* ;



statementMethod :
ID ASSIGN expression SEMICOLON
| THIS DOT ID ASSIGN ID SEMICOLON
|THIS DOT ID ASSIGN expression SEMICOLON
| expression SEMICOLON
                     ;
interfaceDeclaration
    : INTERFACE ID LBRACE interfaceMember* RBRACE
    ;

interfaceMember
    : propertyDeclaration
    | methodDeclaration
    ;

parameter
    : ID COLON type
    ;
parameterList
    : parameter (COMMA parameter)* // قائمة المعاملات، مفصولة بفواصل
    ;
variableDeclaration
    : (CONST | LET | VAR ) ID   ASSIGN expression
    ;

importDeclaration
    : IMPORT LBRACE ID RBRACE FROM STRING_LIT SEMICOLON
    | IMPORT LBRACE COMPONENT RBRACE FROM STRING_LIT SEMICOLON
    | IMPORTS COLON LBRACKET ID? RBRACKET
    ;



type        : STRING_TYPE
            | NUMBER_TYPE
            | BOOLEAN_TYPE
            | ANY_TYPE
            | VOID_TYPE
            | ID
            | list;

list
    : ID LBRACKET RBRACKET
    ;
bodylist
    : (initvalue (COMMA initvalue)*)? // عناصر المصفوفة
    ;

object
    : LBRACE bodyobject RBRACE COMMA?
    ;

bodyobject
    : (ID COLON initvalue (COMMA ID COLON initvalue COMMA?)*)?

    ;

   initvalue
     : NUMBER_LIT                 // قيمة رقمية
     | STRING_LIT                 // قيمة نصية
     | isboolean               // قيمة منطقية
     | LBRACKET bodylist RBRACKET
     | object// مصفوفة
 ;

expression  : STRING_LIT
            | NUMBER_LIT
            | ID
            |isboolean
            | functionCall
            | variableDeclaration
            ;

functionCall
    : ID LPAREN argument* RPAREN
    ;

argument    : expression
            ;
// HTML PARSER
// Root rule: the entire template


// An element can be a tag, plain text, or interpolation
element
    : tag                                  // A tag
    | NAME_HTML (COLON_HTML)?                               // Plain text content
    | interpolation                        // Angular-like interpolation {{ ... }}
    ;

// Tags: opening and closing tags with optional content
tag
    : openingTag element* closingTag       // Regular tag with content inside
    | selfClosingTag                       // Self-closing tag (e.g., <img />)
    ;

// Opening HTML tag
openingTag
    : TAG_OPEN_START_HTML attributes* TAG_CLOSE_END_HTML  // Opening tag with optional attributes
    ;

// Closing HTML tag
closingTag
    : TAG_CLOSE_START_HTML TAG_CLOSE_END_HTML            // Closing tag (e.g., </div>)
    ;

// Self-closing HTML tag (e.g., <img />)
selfClosingTag
    : TAG_OPEN_START_HTML attributes* TAG_END_HTML       // Self-closing tag (e.g., <img />)
    ;

// Attributes for tags (e.g., class="wrapper", src="image.jpg")
attributes
    : NAME_HTML ATTRIBUTE_EQUALS_HTML STRING_HTML            // Basic attribute
    | STRUCTURAL_DIR_HTML ATTRIBUTE_EQUALS_HTML STRING_HTML  // Structural directive (e.g., *ngFor)
    | BINDING_HTML ATTRIBUTE_EQUALS_HTML STRING_HTML         // Property binding (e.g., [src])
    | EVENT_BINDING_HTML ATTRIBUTE_EQUALS_HTML STRING_HTML   // Event binding (e.g., (click))
    ;

// Interpolation syntax for Angular-like template expressions
interpolation
    : INTERPOLATION_START_HTML NAME_HTML INTERPOLATION_END_HTML                         // Angular-like interpolation
    ;


    // css parser
    cssBody : BACKTICK_CSS  cssObjects  BACKTICK_CSS COMMA_CSS?;
cssObjects : csselement (COMMA_CSS csselement)*;
    csselement : DOT_CSS ID_CSS LBRACE_CSS bodyelement+ RBRACE_CSS;
    bodyelement : ID_CSS COLON_CSS cssValue SEMICOLON_CSS;
     cssValue : ID_CSS | PERCENT;  // السماح بأكثر من كلمة للقيم