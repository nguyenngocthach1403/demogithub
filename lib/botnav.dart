import 'package:demo_material_app/detail_screen.dart';
import 'package:demo_material_app/index_screen.dart';
import 'package:flutter/material.dart';
// tung hu hu 
class BottomMenu extends StatelessWidget {
  const BottomMenu({super.key, required this.idx});
  final idx;

  @override
  Widget build(BuildContext context) {
    return BottomNavigationBar(
      currentIndex: idx,
      fixedColor: Colors.blueAccent,
      items: const [
        BottomNavigationBarItem(label: "Trang chủ", icon: Icon(Icons.home)),
        BottomNavigationBarItem(label: "Chi tiết", icon: Icon(Icons.details))
      ],
      onTap: (int indexOfItem) {
        if (indexOfItem == 0) {
          Navigator.popUntil(context, (route) => route.isFirst);
          Navigator.push(context,
              MaterialPageRoute(builder: (context) => const IndexScreen()));
        } else {
          Navigator.popUntil(context, (route) => route.isFirst);
          Navigator.push(context,
              MaterialPageRoute(builder: (context) => const DetailScreen()));
        }
      },
    );
  }
}
