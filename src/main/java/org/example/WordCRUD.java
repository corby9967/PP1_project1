package org.example;
import java.util.*;

public class WordCRUD implements ICRUD{
    ArrayList<Word> list;
    Scanner s;

    public WordCRUD(Scanner s){
        list = new ArrayList<>();
        this.s = s;
    }

    @Override
    public Object add() {
        System.out.print("=> 난이도(1,2,3) & 새 단어 입력 : ");
        int level = s.nextInt();
        String word = s.nextLine();

        System.out.print("뜻 입력 : ");
        String meaning = s.nextLine();

        return new Word(0, level, word, meaning);
    }

    public void addWord(){
        Word one = (Word)add();
        list.add(one);
        System.out.println("새 단어가 단어장에 추가되었습니다. ");
    }

    public void listAll(){
//        System.out.println("---------------------------------");
//        for(int i = 0; i < list.size(); i++){
//            System.out.print((i+1) + " ");
//            System.out.println(list.get(i).toString());
//        }
//        System.out.println("---------------------------------");
    }

    @Override
    public void select(Word o) {

    }

    @Override
    public int update() {
        return 0;
    }

    @Override
    public int delete() {
        return 0;
    }

}
