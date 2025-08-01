package ru.practicum.request.data;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.Path;

import jakarta.annotation.Generated;
import ru.practicum.event.data.QEvent;
import ru.practicum.user.data.QUser;

@Generated("com.querydsl.codegen.EntitySerializer")
public class QRequest extends EntityPathBase<Request> {

    private static final long serialVersionUID = 1L;

    public static final QRequest request = new QRequest("request");

    public final NumberPath<Long> id = createNumber("id", Long.class);
    public final EnumPath<RequestStatus> status = createEnum("status", RequestStatus.class);
    public final DateTimePath<java.time.LocalDateTime> created = createDateTime("created", java.time.LocalDateTime.class);

    public final QUser requestor = new QUser("requestor");
    public final QEvent event = new QEvent("event");

    public QRequest(String variable) {
        super(Request.class, forVariable(variable));
    }

    public QRequest(Path<? extends Request> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRequest(PathMetadata metadata) {
        super(Request.class, metadata);
    }
}
