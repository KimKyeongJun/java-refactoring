package me.whiteship.refactoring._01_smell_mysterious_name._03_rename_field;

// record 키워드는 Java 14버전부터 지원한다.
// 생성자, getter 역할을 하는 메소드 생성, HashAndEquals 자동 생성
public record StudyReview(String reviewer, String review) {
}
