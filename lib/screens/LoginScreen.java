import 'package:flutter/material.dart';
import '../utils/colors.dart';
import '../utils/text_styles.dart';

class LoginScreen extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: SafeArea(
        child: SingleChildScrollView(
          child: Padding(
            padding: const EdgeInsets.all(16.0),
            child: Column(
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                const Text(
                  '9:41', // Placeholder for time
                  style: TextStyle(fontSize: 14, color: textDark),
                ),
                const SizedBox(height: 20),
                Image.asset(
                  'assets/login_icon.png', // Replace with actual asset
                  height: 200,
                ),
                const SizedBox(height: 20),
                const Text(
                  'Login',
                  style: heading,
                ),
                const SizedBox(height: 8),
                const Text(
                  'Enter your login details to access your personal assistant.',
                  style: body,
                ),
                const SizedBox(height: 20),
                Card(
                  color: cardBackground,
                  shape: RoundedRectangleBorder(
                    borderRadius: BorderRadius.circular(12),
                  ),
                  child: Padding(
                    padding: const EdgeInsets.all(16.0),
                    child: Column(
                      children: [
                        TextField(
                          decoration: InputDecoration(
                            labelText: 'Email/Phone',
                            hintText: 'Registered email or phone',
                            hintStyle: hint,
                            border: InputBorder.none,
                          ),
                        ),
                        const Divider(),
                        TextField(
                          obscureText: true,
                          decoration: InputDecoration(
                            labelText: 'Password',
                            hintText: '••••••••',
                            hintStyle: hint,
                            border: InputBorder.none,
                            suffixIcon: Icon(Icons.visibility_off),
                          ),
                        ),
                      ],
                    ),
                  ),
                ),
                const SizedBox(height: 20),
                Row(
                  mainAxisAlignment: MainAxisAlignment.spaceBetween,
                  children: [
                    TextButton(
                      onPressed: () {},
                      child: const Text('Login with OTP?'),
                    ),
                    TextButton(
                      onPressed: () {},
                      child: const Text('Forgot Password?'),
                    ),
                  ],
                ),
                const SizedBox(height: 20),
                ElevatedButton(
                  onPressed: () {},
                  style: ElevatedButton.styleFrom(
                    backgroundColor: primaryColor,
                    padding: const EdgeInsets.symmetric(
                      vertical: 12,
                      horizontal: 80,
                    ),
                    shape: RoundedRectangleBorder(
                      borderRadius: BorderRadius.circular(8),
                    ),
                  ),
                  child: const Text(
                    'Login',
                    style: TextStyle(color: Colors.white),
                  ),
                ),
                const SizedBox(height: 10),
                Center(
                  child: TextButton(
                    onPressed: () {},
                    child: const Text('Don\'t have an account? Sign Up'),
                  ),
                ),
              ],
            ),
          ),
        ),
      ),
    );
  }
}