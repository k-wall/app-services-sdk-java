package com.openshift.cloud.api.connector;

import com.openshift.cloud.api.connector.invoker.ApiException;
import com.openshift.cloud.api.connector.invoker.ApiClient;
import com.openshift.cloud.api.connector.invoker.Configuration;
import com.openshift.cloud.api.connector.invoker.Pair;

import javax.ws.rs.core.GenericType;

import com.openshift.cloud.api.connector.models.AddonParameter;
import com.openshift.cloud.api.connector.models.ConnectorCluster;
import com.openshift.cloud.api.connector.models.ConnectorClusterList;
import com.openshift.cloud.api.connector.models.Error;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConnectorClustersApi {
  private ApiClient apiClient;

  public ConnectorClustersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ConnectorClustersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a new connector cluster
   * 
   * @param async Perform the action in an asynchronous manner (required)
   * @param connectorCluster Connector cluster data (required)
   * @return a {@code ConnectorCluster}
   * @throws ApiException if fails to make API call
   */
  public ConnectorCluster createConnectorCluster(Boolean async, ConnectorCluster connectorCluster) throws ApiException {
    Object localVarPostBody = connectorCluster;
    
    // verify the required parameter 'async' is set
    if (async == null) {
      throw new ApiException(400, "Missing the required parameter 'async' when calling createConnectorCluster");
    }
    
    // verify the required parameter 'connectorCluster' is set
    if (connectorCluster == null) {
      throw new ApiException(400, "Missing the required parameter 'connectorCluster' when calling createConnectorCluster");
    }
    
    // create path and map variables
    String localVarPath = "/api/connector_mgmt/v1/kafka_connector_clusters".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "async", async));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };

    GenericType<ConnectorCluster> localVarReturnType = new GenericType<ConnectorCluster>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete a connector cluster
   * 
   * @param connectorClusterId The id of the connector cluster (required)
   * @return a {@code Error}
   * @throws ApiException if fails to make API call
   */
  public Error deleteConnectorCluster(String connectorClusterId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'connectorClusterId' is set
    if (connectorClusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'connectorClusterId' when calling deleteConnectorCluster");
    }
    
    // create path and map variables
    String localVarPath = "/api/connector_mgmt/v1/kafka_connector_clusters/{connector_cluster_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "connector_cluster_id" + "\\}", apiClient.escapeString(connectorClusterId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };

    GenericType<Error> localVarReturnType = new GenericType<Error>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a connector cluster
   * 
   * @param connectorClusterId The id of the connector cluster (required)
   * @return a {@code ConnectorCluster}
   * @throws ApiException if fails to make API call
   */
  public ConnectorCluster getConnectorCluster(String connectorClusterId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'connectorClusterId' is set
    if (connectorClusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'connectorClusterId' when calling getConnectorCluster");
    }
    
    // create path and map variables
    String localVarPath = "/api/connector_mgmt/v1/kafka_connector_clusters/{connector_cluster_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "connector_cluster_id" + "\\}", apiClient.escapeString(connectorClusterId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };

    GenericType<ConnectorCluster> localVarReturnType = new GenericType<ConnectorCluster>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a connector cluster&#39;s addon parameters
   * 
   * @param connectorClusterId The id of the connector cluster (required)
   * @return a {@code List<AddonParameter>}
   * @throws ApiException if fails to make API call
   */
  public List<AddonParameter> getConnectorClusterAddonParameters(String connectorClusterId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'connectorClusterId' is set
    if (connectorClusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'connectorClusterId' when calling getConnectorClusterAddonParameters");
    }
    
    // create path and map variables
    String localVarPath = "/api/connector_mgmt/v1/kafka_connector_clusters/{connector_cluster_id}/addon_parameters".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "connector_cluster_id" + "\\}", apiClient.escapeString(connectorClusterId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };

    GenericType<List<AddonParameter>> localVarReturnType = new GenericType<List<AddonParameter>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Returns a list of connector clusters
   * 
   * @param page Page index (optional)
   * @param size Number of items in each page (optional)
   * @return a {@code ConnectorClusterList}
   * @throws ApiException if fails to make API call
   */
  public ConnectorClusterList listConnectorClusters(String page, String size) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/connector_mgmt/v1/kafka_connector_clusters".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };

    GenericType<ConnectorClusterList> localVarReturnType = new GenericType<ConnectorClusterList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * udpate a connector cluster
   * 
   * @param connectorClusterId The id of the connector cluster (required)
   * @param connectorCluster Data to updated connector with (required)
   * @throws ApiException if fails to make API call
   */
  public void updateConnectorClusterById(String connectorClusterId, ConnectorCluster connectorCluster) throws ApiException {
    Object localVarPostBody = connectorCluster;
    
    // verify the required parameter 'connectorClusterId' is set
    if (connectorClusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'connectorClusterId' when calling updateConnectorClusterById");
    }
    
    // verify the required parameter 'connectorCluster' is set
    if (connectorCluster == null) {
      throw new ApiException(400, "Missing the required parameter 'connectorCluster' when calling updateConnectorClusterById");
    }
    
    // create path and map variables
    String localVarPath = "/api/connector_mgmt/v1/kafka_connector_clusters/{connector_cluster_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "connector_cluster_id" + "\\}", apiClient.escapeString(connectorClusterId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}