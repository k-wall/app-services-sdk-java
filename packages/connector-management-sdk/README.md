# connector-management-sdk

Connector Service Fleet Manager

- API version: 0.1.0

Connector Service Fleet Manager is a Rest API to manage connectors.


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.redhat.cloud</groupId>
  <artifactId>connector-management-sdk</artifactId>
  <version>0.1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'connector-management-sdk' jar has been published to maven central.
    mavenLocal()       // Needed if the 'connector-management-sdk' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.redhat.cloud:connector-management-sdk:0.1.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/connector-management-sdk-0.1.0.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.openshift.cloud.api.connector.invoker.*;
import com.openshift.cloud.api.connector.invoker.auth.*;
import com.openshift.cloud.api.connector.models.*;
import com.openshift.cloud.api.connector.ConnectorClustersApi;

public class ConnectorClustersApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.openshift.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ConnectorClustersApi apiInstance = new ConnectorClustersApi(defaultClient);
        Boolean async = true; // Boolean | Perform the action in an asynchronous manner
        ConnectorClusterRequest connectorClusterRequest = new ConnectorClusterRequest(); // ConnectorClusterRequest | Connector cluster data
        try {
            ConnectorCluster result = apiInstance.createConnectorCluster(async, connectorClusterRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectorClustersApi#createConnectorCluster");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.openshift.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ConnectorClustersApi* | [**createConnectorCluster**](docs/ConnectorClustersApi.md#createConnectorCluster) | **POST** /api/connector_mgmt/v1/kafka_connector_clusters | Create a new connector cluster
*ConnectorClustersApi* | [**deleteConnectorCluster**](docs/ConnectorClustersApi.md#deleteConnectorCluster) | **DELETE** /api/connector_mgmt/v1/kafka_connector_clusters/{connector_cluster_id} | Delete a connector cluster
*ConnectorClustersApi* | [**getConnectorCluster**](docs/ConnectorClustersApi.md#getConnectorCluster) | **GET** /api/connector_mgmt/v1/kafka_connector_clusters/{connector_cluster_id} | Get a connector cluster
*ConnectorClustersApi* | [**getConnectorClusterAddonParameters**](docs/ConnectorClustersApi.md#getConnectorClusterAddonParameters) | **GET** /api/connector_mgmt/v1/kafka_connector_clusters/{connector_cluster_id}/addon_parameters | Get a connector cluster&#39;s addon parameters
*ConnectorClustersApi* | [**listConnectorClusters**](docs/ConnectorClustersApi.md#listConnectorClusters) | **GET** /api/connector_mgmt/v1/kafka_connector_clusters | Returns a list of connector clusters
*ConnectorClustersApi* | [**updateConnectorClusterById**](docs/ConnectorClustersApi.md#updateConnectorClusterById) | **PUT** /api/connector_mgmt/v1/kafka_connector_clusters/{connector_cluster_id} | udpate a connector cluster
*ConnectorServiceApi* | [**getVersionMetadata**](docs/ConnectorServiceApi.md#getVersionMetadata) | **GET** /api/connector_mgmt/v1 | Returns the version metadata
*ConnectorTypesApi* | [**getConnectorTypeByID**](docs/ConnectorTypesApi.md#getConnectorTypeByID) | **GET** /api/connector_mgmt/v1/kafka_connector_types/{connector_type_id} | Get a connector type by id
*ConnectorTypesApi* | [**getConnectorTypes**](docs/ConnectorTypesApi.md#getConnectorTypes) | **GET** /api/connector_mgmt/v1/kafka_connector_types | Returns a list of connector types
*ConnectorsApi* | [**createConnector**](docs/ConnectorsApi.md#createConnector) | **POST** /api/connector_mgmt/v1/kafka_connectors | Create a new connector
*ConnectorsApi* | [**deleteConnector**](docs/ConnectorsApi.md#deleteConnector) | **DELETE** /api/connector_mgmt/v1/kafka_connectors/{id} | Delete a connector
*ConnectorsApi* | [**getConnector**](docs/ConnectorsApi.md#getConnector) | **GET** /api/connector_mgmt/v1/kafka_connectors/{id} | Get a connector
*ConnectorsApi* | [**listConnectors**](docs/ConnectorsApi.md#listConnectors) | **GET** /api/connector_mgmt/v1/kafka_connectors | Returns a list of connector types
*ConnectorsApi* | [**patchConnector**](docs/ConnectorsApi.md#patchConnector) | **PATCH** /api/connector_mgmt/v1/kafka_connectors/{id} | Patch a connector


## Documentation for Models

 - [AddonParameter](docs/AddonParameter.md)
 - [Channel](docs/Channel.md)
 - [Connector](docs/Connector.md)
 - [ConnectorCluster](docs/ConnectorCluster.md)
 - [ConnectorClusterList](docs/ConnectorClusterList.md)
 - [ConnectorClusterListAllOf](docs/ConnectorClusterListAllOf.md)
 - [ConnectorClusterMeta](docs/ConnectorClusterMeta.md)
 - [ConnectorClusterRequest](docs/ConnectorClusterRequest.md)
 - [ConnectorClusterRequestMeta](docs/ConnectorClusterRequestMeta.md)
 - [ConnectorClusterState](docs/ConnectorClusterState.md)
 - [ConnectorClusterStatus](docs/ConnectorClusterStatus.md)
 - [ConnectorClusterStatusStatus](docs/ConnectorClusterStatusStatus.md)
 - [ConnectorClusterTarget](docs/ConnectorClusterTarget.md)
 - [ConnectorConfiguration](docs/ConnectorConfiguration.md)
 - [ConnectorDesiredState](docs/ConnectorDesiredState.md)
 - [ConnectorList](docs/ConnectorList.md)
 - [ConnectorListAllOf](docs/ConnectorListAllOf.md)
 - [ConnectorMeta](docs/ConnectorMeta.md)
 - [ConnectorMetaAllOf](docs/ConnectorMetaAllOf.md)
 - [ConnectorRequest](docs/ConnectorRequest.md)
 - [ConnectorRequestMeta](docs/ConnectorRequestMeta.md)
 - [ConnectorState](docs/ConnectorState.md)
 - [ConnectorStatus](docs/ConnectorStatus.md)
 - [ConnectorStatusStatus](docs/ConnectorStatusStatus.md)
 - [ConnectorType](docs/ConnectorType.md)
 - [ConnectorTypeAllOf](docs/ConnectorTypeAllOf.md)
 - [ConnectorTypeList](docs/ConnectorTypeList.md)
 - [ConnectorTypeListAllOf](docs/ConnectorTypeListAllOf.md)
 - [DeploymentLocation](docs/DeploymentLocation.md)
 - [Error](docs/Error.md)
 - [ErrorAllOf](docs/ErrorAllOf.md)
 - [KafkaConnectionSettings](docs/KafkaConnectionSettings.md)
 - [ModelList](docs/ModelList.md)
 - [ObjectMeta](docs/ObjectMeta.md)
 - [ObjectReference](docs/ObjectReference.md)
 - [SchemaRegistryConnectionSettings](docs/SchemaRegistryConnectionSettings.md)
 - [ServiceAccount](docs/ServiceAccount.md)
 - [ServiceConnectionSettings](docs/ServiceConnectionSettings.md)
 - [VersionMetadata](docs/VersionMetadata.md)
 - [VersionMetadataAllOf](docs/VersionMetadataAllOf.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### Bearer


- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



