parser grammar typescriptparser;

options { tokenVocab=typescriptlexer; }

// Root rule
program     : statement+;

// Statements
statement   :
              componentDeclaration
            |classDeclaration
            | interfaceDeclaration
            | functionDeclaration
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
        | style;
selector :SELECTOR COLON STRING_LIT ;
standalone : STANDALONE COLON isboolean  ;
template :TEMPLATE COLON STRING_LIT ;
style :STYLE COLON LBRACKET STRING_LIT RBRACKET ;
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
    : ID COLON type ASSIGN initvalue
    ;

methodDeclaration
    : ID LPAREN parameter* RPAREN COLON type? SEMICOLON
    ;

interfaceDeclaration
    : INTERFACE ID LBRACE interfaceMember* RBRACE
    ;

interfaceMember
    : propertyDeclaration
    | methodDeclaration
    ;

functionDeclaration
    : FUNCTION ID LPAREN parameter* RPAREN COLON type? SEMICOLON
    ;

parameter
    : ID COLON type
    ;

variableDeclaration
    : (CONST | LET | VAR) ID COLON type ASSIGN expression SEMICOLON
    ;

importDeclaration
    : IMPORT LBRACE ID RBRACE FROM STRING_LIT SEMICOLON
    | IMPORTS COLON LBRACKET ID? RBRACKET
    ;



type        : STRING_TYPE
            | NUMBER_TYPE
            | BOOLEAN_TYPE
            | ANY_TYPE
            | VOID_TYPE
            | ID
            | list;

list : ID LBRACKET RBRACKET
    | ID LBRACKET RBRACKET ASSIGN LBRACKET bodylist RBRACKET SEMICOLON ;
    bodylist : (object COMMA?)* | (NUMBER_LIT COMMA?)* ;
   object : LBRACE bodyobject RBRACE ;
   bodyobject : (ID COLON initvalue COMMA? )*;
initvalue :(NUMBER_LIT)+ | (STRING_LIT)+  ;

expression  : STRING_LIT
            | NUMBER_LIT
            | ID
            | functionCall
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
