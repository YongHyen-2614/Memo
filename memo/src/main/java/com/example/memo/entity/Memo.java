package com.example.memo.entity;

import com.example.memo.dto.MemoRequestDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Memo {

    private Long id;
    private String title;
    private String contents;

    // memo class를 갖는 생성자
    public void update(MemoRequestDto memo) {
        this.title = memo.getTitle();
        this.contents = memo.getContents();

    }
}
