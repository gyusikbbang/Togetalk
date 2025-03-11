package GUI;

import javax.swing.*;
import java.awt.*;

public class Swingui extends JFrame {

    public Swingui() {
      setTitle("채팅 프로그램");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      // 프레임 종료버튼 사용 시 응용 프로그램도 종료시키는 방법

      // 컨텐트팬 알아내기
      Container container = getContentPane();
      // 컨텐트팬 배경색 설정
      container.setBackground(Color.WHITE);

      // 컨턴트팬 레이아웃 설정
      container.setLayout(new FlowLayout());

      // 프레임에 JButton 컴포넌트 추가하기
      container.add(new JButton("전송"));


      setSize(300, 200);
      setVisible(true);
    }


}
