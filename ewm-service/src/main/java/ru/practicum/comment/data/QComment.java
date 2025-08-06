package ru.practicum.comment.data;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import jakarta.annotation.Generated;
import ru.practicum.event.data.QEvent;
import ru.practicum.user.data.QUser;

@Generated("com.querydsl.codegen.EntitySerializer")
public class QComment extends EntityPathBase<Comment> {

    private static final long serialVersionUID = 1L;

    public static final QComment comment = new QComment("comment");

    public final NumberPath<Long> id = createNumber("id", Long.class);
    public final StringPath text = createString("text");
    public final DateTimePath<java.time.LocalDateTime> created = createDateTime("created", java.time.LocalDateTime.class);
    public final DateTimePath<java.time.LocalDateTime> editedOn = createDateTime("editedOn", java.time.LocalDateTime.class);

    public final QUser commentator = new QUser("commentator");
    public final QEvent event = new QEvent("event");

    public QComment(String variable) {
        super(Comment.class, forVariable(variable));
    }

    public QComment(Path<? extends Comment> path) {
        super(path.getType(), path.getMetadata());
    }

    public QComment(PathMetadata metadata) {
        super(Comment.class, metadata);
    }
}
