package com.stubbornjava.webapp.post;

import java.util.List;

import com.google.common.collect.Lists;

public class Tags {
    private static final List<Tag> TAGS = Lists.newArrayList();
    public static final Tag JSON = addTag(new Tag(1L, "JSON"));
    public static final Tag Configuration = addTag(new Tag(2L, "Configuration"));
    public static final Tag HtmlTemplating = addTag(new Tag(3L, "HTML Templating"));
    public static final Tag WebServer = addTag(new Tag(4L, "Web Server"));
    public static final Tag ExceptionHandling = addTag(new Tag(5L, "Exception Handling"));
    public static final Tag Middleware = addTag(new Tag(6L, "Middleware"));
    public static final Tag Logging = addTag(new Tag(7L, "Logging"));
    public static final Tag REST = addTag(new Tag(8L, "REST"));
    public static final Tag Monitoring = addTag(new Tag(9L, "Monitoring"));
    public static final Tag HTTP = addTag(new Tag(10L, "HTTP"));
    public static final Tag SQL = addTag(new Tag(11L, "SQL"));
    public static final Tag Gradle = addTag(new Tag(12L, "Gradle"));
    public static final Tag Enums = addTag(new Tag(13L, "Enums"));
    public static final Tag Webpack = addTag(new Tag(14L, "Webpack"));
    public static final Tag NPM = addTag(new Tag(15L, "NPM"));
    public static final Tag SEO = addTag(new Tag(16L, "SEO"));
    public static final Tag Microservice = addTag(new Tag(17L, "Microservice"));
    public static final Tag Monolith = addTag(new Tag(18L, "Monolith"));
    public static final Tag Caching = addTag(new Tag(19L, "Caching"));
    public static final Tag Docker = addTag(new Tag(20L, "Docker"));
    public static final Tag MySQL = addTag(new Tag(21L, "MySQL"));
    public static final Tag Elasticsearch = addTag(new Tag(22L, "Elasticsearch"));
    public static final Tag Ansible = addTag(new Tag(23L, "Ansible"));
    public static final Tag Supervisord = addTag(new Tag(24L, "Supervisord"));
    public static final Tag Security = addTag(new Tag(25L, "Security"));
    public static final Tag Resiliency = addTag(new Tag(26L, "Resiliency"));
    public static final Tag Alerting = addTag(new Tag(27L, "Alerting"));
    public static final Tag Grafana = addTag(new Tag(27L, "Grafana"));

    private static Tag addTag(Tag tag) {
        TAGS.add(tag);
        return tag;
    }

    public static List<Tag> getTags() {
        return TAGS;
    }
}
