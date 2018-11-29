// Importing java Math class
print(java.lang.Math.sqrt(4))

// Importing java package Using JavaImporter
var importFile = new JavaImporter(java.util)
var arrayList = new importFile.ArrayList()
arrayList.add(4)
arrayList.add(5)
print(arrayList)
print(arrayList.getClass())

// Importing multiple java packages
var importMulti = new JavaImporter(java.lang.String, java.util, java.io)
with(importMulti) {
    var linkedHashSet = new LinkedHashSet()
    linkedHashSet.add("Aman")
    linkedHashSet.add(new File("hello.js"))
    linkedHashSet.add("India".toUpperCase())
}
print(linkedHashSet)

// Run using below command
// jjs importJavaPackages.js