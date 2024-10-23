package com.learnkafka.domain;

import java.awt.print.Book;

public record LibraryEvent(

		Integer id,
		LibraryEventType type,
		Book book

) {
}
