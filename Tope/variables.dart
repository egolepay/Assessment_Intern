void main() {
  // Core Data Types
  int myInt = 42;
  double myDouble = 3.14;
  String myString = "Hello, Dart!";
  bool myBool = true;

  // Collection Types
  List<int> myList = [1, 2, 3];
  Map<String, int> myMap = {
    "apple": 3,
    "banana": 5,
  };
  Set<String> mySet = {"A", "B", "C"};

  // Special Types
  dynamic myDynamic = "I can change";
  myDynamic = 100; // still valid

  var myVar = "Inferred as String";
  // myVar = 10; // This would cause a type error because it's inferred as String

  // Constants
  const double myConst = 3.14159; // Compile-time constant
  final DateTime myFinal = DateTime.now(); // Runtime constant

  // Nullable Types (optional)
  int? nullableInt = null;
  String? nullableString = null;

  // Printing all values
  print("int: $myInt");
  print("double: $myDouble");
  print("String: $myString");
  print("bool: $myBool");
  print("List: $myList");
  print("Map: $myMap");
  print("Set: $mySet");
  print("dynamic: $myDynamic");
  print("var: $myVar");
  print("const: $myConst");
  print("final: $myFinal");
  print("nullable int: $nullableInt");
  print("nullable String: $nullableString");
}
