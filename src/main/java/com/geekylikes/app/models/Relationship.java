//package com.geekylikes.app.models;
//
//import com.fasterxml.jackson.annotation.JsonIncludeProperties;
//
//import javax.persistence.*;
//
//@Entity
//public class Relationship {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "originator_id", referencedColumnName = "id", table = "developer")
//    @JsonIncludeProperties("id")
//    private Developer originator;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "recipient_id", referencedColumnName = "id", table = "developer")
//    @JsonIncludeProperties("id")
//    private Developer recipient;
////
////    private
//}
