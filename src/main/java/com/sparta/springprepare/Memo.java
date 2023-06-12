package com.sparta.springprepare;

import lombok.*;


@RequiredArgsConstructor // Required를 쓰려면 final이 달려있어야 함 (final이 달린 필드를 가진 생성자를 만듦)
// NoArgsContructor: 매개변수가 아무것도 없는 생성자, AllArgsConstructor: 모든 필드를 매개변수로 받는 생성자
@Getter
@Setter
public class Memo {
    private final String username;
    private String contents;
}

class Main{
    public static void main(String[] args) {
        Memo memo = new Memo("Robbert");

//        memo.setUsername("Robbie");
        System.out.println(memo.getUsername());
    }
}