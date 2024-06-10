package org.example.todo1.domain.todocard.model

import jakarta.persistence.Entity
import java.time.LocalDateTime

@Entity
class TodoCard (
    @Column
    var title : String,

    @Column
    var content : String,

    @CreationTimestamp
    @Column(umpdatable = false)
    var authorName : String
){
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    val id: Long? = null

    val createdAt: LocalDateTime = LocalDateTime.now()
}
