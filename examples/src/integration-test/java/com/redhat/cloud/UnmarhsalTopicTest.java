package com.redhat.cloud;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.openshift.cloud.api.kas.auth.models.Topic;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UnmarhsalTopicTest {

    @Test
    public void testUnmarshalTopic() throws JsonProcessingException {
        String topic ="{\n" +
                "  \"config\": [\n" +
                "    {\n" +
                "      \"key\": \"compression.type\",\n" +
                "      \"value\": \"producer\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"key\": \"leader.replication.throttled.replicas\",\n" +
                "      \"value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"key\": \"remote.storage.enable\",\n" +
                "      \"value\": \"false\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"key\": \"message.downconversion.enable\",\n" +
                "      \"value\": \"true\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"key\": \"min.insync.replicas\",\n" +
                "      \"value\": \"2\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"key\": \"segment.jitter.ms\",\n" +
                "      \"value\": \"0\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"key\": \"local.retention.ms\",\n" +
                "      \"value\": \"-2\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"key\": \"cleanup.policy\",\n" +
                "      \"value\": \"delete\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"key\": \"flush.ms\",\n" +
                "      \"value\": \"9223372036854775807\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"key\": \"follower.replication.throttled.replicas\",\n" +
                "      \"value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"key\": \"segment.bytes\",\n" +
                "      \"value\": \"1073741824\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"key\": \"retention.ms\",\n" +
                "      \"value\": \"604800000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"key\": \"flush.messages\",\n" +
                "      \"value\": \"9223372036854775807\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"key\": \"message.format.version\",\n" +
                "      \"value\": \"3.0-IV1\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"key\": \"max.compaction.lag.ms\",\n" +
                "      \"value\": \"9223372036854775807\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"key\": \"file.delete.delay.ms\",\n" +
                "      \"value\": \"60000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"key\": \"max.message.bytes\",\n" +
                "      \"value\": \"1048588\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"key\": \"min.compaction.lag.ms\",\n" +
                "      \"value\": \"0\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"key\": \"message.timestamp.type\",\n" +
                "      \"value\": \"CreateTime\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"key\": \"local.retention.bytes\",\n" +
                "      \"value\": \"-2\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"key\": \"preallocate\",\n" +
                "      \"value\": \"false\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"key\": \"min.cleanable.dirty.ratio\",\n" +
                "      \"value\": \"0.5\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"key\": \"index.interval.bytes\",\n" +
                "      \"value\": \"4096\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"key\": \"unclean.leader.election.enable\",\n" +
                "      \"value\": \"false\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"key\": \"retention.bytes\",\n" +
                "      \"value\": \"-1\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"key\": \"delete.retention.ms\",\n" +
                "      \"value\": \"86400000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"key\": \"segment.ms\",\n" +
                "      \"value\": \"604800000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"key\": \"message.timestamp.difference.max.ms\",\n" +
                "      \"value\": \"9223372036854775807\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"key\": \"segment.index.bytes\",\n" +
                "      \"value\": \"10485760\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"name\": \"cli-e2e-test-topic\",\n" +
                "  \"partitions\": [\n" +
                "    {\n" +
                "      \"isr\": [\n" +
                "        {\n" +
                "          \"id\": 0\n" +
                "        },\n" +
                "        {\n" +
                "          \"id\": 1\n" +
                "        },\n" +
                "        {\n" +
                "          \"id\": 12\n" +
                "        }\n" +
                "      ],\n" +
                "      \"leader\": {\n" +
                "        \"id\": 123\n" +
                "      },\n" +
                "      \"partition\": 0,\n" +
                "      \"replicas\": [\n" +
                "        {\n" +
                "          \"id\": 0\n" +
                "        },\n" +
                "        {\n" +
                "          \"id\": 1\n" +
                "        },\n" +
                "        {\n" +
                "          \"id\": 2\n" +
                "        }\n" +
                "      ]\n" +
                "    }\n" +
                "  ]\n" +
                "}";

        assertNotNull(new ObjectMapper().readValue(topic , Topic.class));


    }
}

