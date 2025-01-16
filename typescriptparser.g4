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
    : DECORATOR COMPONENT LPAREN LBRACE componentDeclarationBody RBRACE RPAREN;
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
template :TEMPLATE COLON STRING_LIT ;
styles :STYLES COLON LBRACKET STRING_LIT RBRACKET ;
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

// Starting rule for parsing a TypeScript file
//typescriptFile : statement* EOF;

// Handle import statements
//importStatement
//    : IMPORT importSpecifier FROM STRING_LIT   SEMICOLON
//    ;

//importSpecifier
//    : LBRACE ID (COMMA ID)* RBRACE       // Handles imports like `{ Component }`
//    | ID                                  // Handles default imports like `import {Something} from 'module'`
//    ;


/*importStatement
    : IMPORT STRING_LIT FROM DECORATOR  SEMICOLON
    ;
*/
// Handle component declarations


//classBody
//    : LBRACE classBodyContent* RBRACE
//    ;
//
//classBodyContent
//    : methodDeclaration
//    | propertyDeclaration
//    ;




