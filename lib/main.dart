import 'package:edu_ui/utils/colors.dart';
import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'EDU Login App',
      theme: ThemeData(
        primaryColor: primaryColor,
      ),
      home: const LoginScreen(),
    );
  }
}// In screens/login_screen.dart

class LoginScreen extends StatelessWidget {
  const LoginScreen({super.key}); // Make sure 'const' is here

  @override
  Widget build(BuildContext context) {
    // ... your widget's build method
    return Scaffold(
      appBar: AppBar(title: const Text('Login')),
      body: const Center(child: Text('Login Screen Content')),
    );
  }
}
