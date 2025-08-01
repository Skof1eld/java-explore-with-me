package ru.practicum.event.data;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.Path;

import jakarta.annotation.Generated;
import ru.practicum.category.data.QCategory;
import ru.practicum.user.data.QUser;

@Generated("com.querydsl.codegen.EntitySerializer")
public class QEvent extends EntityPathBase<Event> {

    private static final long serialVersionUID = 1L;

    public static final QEvent event = new QEvent("event");

    public final StringPath annotation = createString("annotation");
    public final QCategory category = new QCategory("category");
    public final DateTimePath<java.time.LocalDateTime> createdOn = createDateTime("createdOn", java.time.LocalDateTime.class);
    public final StringPath description = createString("description");
    public final DateTimePath<java.time.LocalDateTime> eventDate = createDateTime("eventDate", java.time.LocalDateTime.class);
    public final NumberPath<Long> id = createNumber("id", Long.class);
    public final QUser initiator = new QUser("initiator");
    public final NumberPath<Float> lat = createNumber("lat", Float.class);
    public final NumberPath<Float> lon = createNumber("lon", Float.class);
    public final BooleanPath paid = createBoolean("paid");
    public final NumberPath<Integer> participantLimit = createNumber("participantLimit", Integer.class);
    public final DateTimePath<java.time.LocalDateTime> publishedOn = createDateTime("publishedOn", java.time.LocalDateTime.class);
    public final BooleanPath requestModeration = createBoolean("requestModeration");
    public final EnumPath<EventState> state = createEnum("state", EventState.class);
    public final StringPath title = createString("title");

    public QEvent(String variable) {
        super(Event.class, forVariable(variable));
    }

    public QEvent(Path<? extends Event> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEvent(PathMetadata metadata) {
        super(Event.class, metadata);
    }
}
