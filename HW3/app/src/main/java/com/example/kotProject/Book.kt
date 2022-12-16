package com.example.kotProject

class Book {

    private var name: String? = null
    private var writer: String? = null
    private var publisher: String? = null
    private var publishDate: String? = null
    private var version: String? = null
    private var summary: String? = null
    fun getName(): String? {
        return name
    }

    fun setName(name: String?) {
        this.name = name
    }

    fun getWriter(): String? {
        return writer
    }

    fun setWriter(writer: String?) {
        this.writer = writer
    }

    fun getPublisher(): String? {
        return publisher
    }

    fun setPublisher(publisher: String?) {
        this.publisher = publisher
    }

    fun getPublishDate(): String? {
        return publishDate
    }

    fun setPublishDate(publishDate: String?) {
        this.publishDate = publishDate
    }

    fun getVersion(): String? {
        return version
    }

    fun setVersion(version: String?) {
        this.version = version
    }

    fun getSummary(): String? {
        return summary
    }

    fun setSummary(summary: String?) {
        this.summary = summary
    }
}