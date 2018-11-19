/**
 * In Nashorn, heredocs are simply multi-line strings. You can create it with << followed by 
 * a special termination marker, which is EOF. You can also embed JavaScript expressions in 
 * ${...} expressions.
 */
var message = <<EOF
This is JavaScript file.
It contains multiple line
of code.
EOF
print message

// Run Command
// jjs -scripting heredocs.js