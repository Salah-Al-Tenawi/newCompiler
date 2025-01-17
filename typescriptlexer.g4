lexer grammar typescriptlexer;

// Keywords
IF        : 'if';
ELSE      : 'else';
FOR       : 'for';
FUNCTION  : 'function';
CLASS     : 'class';
INTERFACE : 'interface';
IMPORT    : 'import';
EXPORT    : 'export';
CONST     : 'const';
LET       : 'let';
VAR       : 'var';
FROM      : 'from';
COMPONENT : 'Component'; // Already defined

// Angular-specific Keywords
SELECTOR  : 'selector';   // Add 'selector' as a keyword
STANDALONE: 'standalone';  // Add 'standalone' as a keyword
IMPORTS   : 'imports';
TEMPLATE : 'template' ->pushMode(HTML);
STYLES : 'styles' ->pushMode(CSS);



// Type annotations
STRING_TYPE : 'string';
NUMBER_TYPE : 'number';
BOOLEAN_TYPE: 'boolean';
ANY_TYPE    : 'any';
VOID_TYPE   : 'void';

// Punctuation
COMMA      : ',';
COLON      : ':';
DOT        : '.';
SEMICOLON  : ';';
EQUALS     : '==';
THIS: 'this';
// Operators
ASSIGN     : '=';
PLUS       : '+';
MINUS      : '-';
STAR       : '*';
SLASH      : '/';
LESS       : '<';
GREATER    : '>';
EQUAL      : '==';
NOT_EQUAL  : '!=';

// Parentheses and Braces
LPAREN     : '(';
RPAREN     : ')';
LBRACE     : '{';
RBRACE     : '}';
// Identifiers (variables, functions, etc.)

TRUE : 'true';
FALSE : 'false';
ID  : [a-zA-Z_][a-zA-Z0-9_]*;

// Literals
STRING_LIT : '\'' (~['\\])* '\''   // Single-quoted strings like 'module'
           | '"' (~["\\])* '"' ;   // Double-quoted strings like "module"

NUMBER_LIT : [0-9]+;

// Whitespace and comments
WS         : [ \t\r\n]+ -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;

// Angular/TypeScript specific
DECORATOR  : '@';
AS         : 'as';
TYPE       : 'type';
LBRACKET   : '[';
RBRACKET   : ']';
OR : '|';
BACKTICK : '`';


mode HTML ;

LINE_COMMENT_HTML: '//' ~[\r\n]* -> skip;
BLOCK_COMMENT_HTML: '/*' .*? '*/' -> skip;
// Start of the template block
BACKTICK_HTML: '`';                          // End of the template block

// Tag-related tokens
TAG_OPEN_START_HTML    : '<' NAME_HTML;                     // Opening tag start: <div
TAG_CLOSE_START_HTML   : '</' NAME_HTML;                    // Closing tag start: </div
TAG_CLOSE_END_HTML     : '>';                          // End of a tag: >
TAG_END_HTML           : '/>';                         // Self-closing tag: />

// Attribute-related tokens
ATTRIBUTE_EQUALS_HTML  : '=';                          // Equals sign for attributes
STRING_HTML            : '"' (~["\r\n])* '"';          // Quoted string values
STRUCTURAL_DIR_HTML    : '*' NAME_HTML;                     // Structural directive (e.g., *ngFor)
BINDING_HTML           : '[' NAME_HTML ']';                 // Property binding (e.g., [src])
EVENT_BINDING_HTML     : '(' NAME_HTML ')';                 // Event binding (e.g., (click))

// Angular-specific characters
NEGATION_HTML          : '!';                          // Angular negation (e.g., *ngIf="!condition")
COLON_HTML             : ':';                          // Colon for event and property bindings (e.g., (click), [src])

// Object path and interpolation
INTERPOLATION_START_HTML : '{{';                         // Start of Angular interpolation
INTERPOLATION_END_HTML  : '}}';                         // End of Angular interpolation
DOT_HTML               : '.';                          // Dot for object path access (e.g., product.name)
NAME_HTML: [a-zA-Z_][a-zA-Z0-9_!.-]*;
END_TEMPLATE :'`,' ->popMode;
// Plain text content inside tags
//TEXT              : ~[<`\r\n{}!]+;                 // Allow text excluding <, `, {, }, !, and newlines

// General tokens
WS_HTML                : [ \t\r\n]+ -> skip;           // Ignore whitespace globally


mode CSS ;
BACKTICK_CSS: '`';
COLON_CSS : ':';
COMMA_CSS: ',';
// End of the template block
OPEN_LIST : '[';
CLOSE_LIST :']'->popMode;
DOT_CSS: '.';
SEMICOLON_CSS : ';';
LBRACE_CSS     : '{';
RBRACE_CSS     : '}';
PERCENT : '%';
WS_CSS         : [ \t\r\n]+ -> skip;
LINE_COMMENT_CSS: '//' ~[\r\n]* -> skip;
BLOCK_COMMENT_CSS: '/*' .*? '*/' -> skip;
PX   : 'px';
EM   : 'em';
REM  : 'rem';
ID_CSS : [0-9]+ (PX | EM | REM | PERCENT)?  // أرقام مع أو بدون وحدات
  | '#' [a-fA-F0-9]{3,6}              // ألوان سداسية
  | 'rgb' '(' [0-9]{1,3} ',' [0-9]{1,3} ',' [0-9]{1,3} ')' // ألوان RGB
  | [a-zA-Z_][a-zA-Z0-9_-]*;          // معرفات CSS
