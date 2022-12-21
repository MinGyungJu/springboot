package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {
   
   //콘솔로 찍지말고 로그로 찍어서 확인해보자
   private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
   
   
   
   //즉 url 에 insertBoard 메핑 들어오면 함수가실행된다 뜻
   @RequestMapping("/insertBoard")
   public void insertBoard() {
      logger.info("[insertBoard]");
   }

   
   
   
   @RequestMapping("/getBoardList")
   public void getBoardList() {
      logger.info("[getBoardList]");
   }

   //jsp 는 웹app 밑에있어야하고 템플릿밑에는 html 이 들어간다
   //웹app는 누구나 접근 가능하니 웹인포로 보안 폴더도 만들어야함
   //jsp 개발 웹인프 - 뷰스 아래에 만들어야함
}