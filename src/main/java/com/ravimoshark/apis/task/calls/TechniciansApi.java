/*
 * Ravimoshark Task API
 * This is an API to interact with Ravimoshark task database. # Introduction This API allow to create, modify and delete task, visits, technicians and interventions. # User Authentication This API does not contain any kind of user validation but It request to have a valid authentication user to interact with it. For more information about user Authentication, please refer to [Ravimoshark User Authentication](https://ravimoshark.com/back/apis/auth/latest). 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: dev@ravimoshark.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.ravimoshark.apis.task.calls;

import com.ravimoshark.apis.task.ApiCallback;
import com.ravimoshark.apis.task.ApiClient;
import com.ravimoshark.apis.task.ApiException;
import com.ravimoshark.apis.task.ApiResponse;
import com.ravimoshark.apis.task.Configuration;
import com.ravimoshark.apis.task.Pair;
import com.ravimoshark.apis.task.ProgressRequestBody;
import com.ravimoshark.apis.task.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.ravimoshark.apis.task.model.CustomError;
import com.ravimoshark.apis.task.model.Deleted;
import com.ravimoshark.apis.task.model.IdInteger;
import com.ravimoshark.apis.task.model.InlineResponse2002;
import com.ravimoshark.apis.task.model.Technicians;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TechniciansApi {
    private ApiClient apiClient;

    public TechniciansApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TechniciansApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for addTechnician
     * @param body  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addTechnicianCall(Technicians body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/technicians";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call addTechnicianValidateBeforeCall(Technicians body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling addTechnician(Async)");
        }
        
        com.squareup.okhttp.Call call = addTechnicianCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Add one technician.
     * Add one technician.
     * @param body  (required)
     * @return Technicians
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Technicians addTechnician(Technicians body) throws ApiException {
        ApiResponse<Technicians> resp = addTechnicianWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Add one technician.
     * Add one technician.
     * @param body  (required)
     * @return ApiResponse&lt;Technicians&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Technicians> addTechnicianWithHttpInfo(Technicians body) throws ApiException {
        com.squareup.okhttp.Call call = addTechnicianValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<Technicians>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Add one technician. (asynchronously)
     * Add one technician.
     * @param body  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addTechnicianAsync(Technicians body, final ApiCallback<Technicians> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = addTechnicianValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Technicians>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteTechnician
     * @param id id to delete or search (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteTechnicianCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/technicians/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteTechnicianValidateBeforeCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteTechnician(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteTechnicianCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete one technician.
     * Delete one technician.
     * @param id id to delete or search (required)
     * @return IdInteger
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public IdInteger deleteTechnician(Long id) throws ApiException {
        ApiResponse<IdInteger> resp = deleteTechnicianWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Delete one technician.
     * Delete one technician.
     * @param id id to delete or search (required)
     * @return ApiResponse&lt;IdInteger&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<IdInteger> deleteTechnicianWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = deleteTechnicianValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<IdInteger>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete one technician. (asynchronously)
     * Delete one technician.
     * @param id id to delete or search (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteTechnicianAsync(Long id, final ApiCallback<IdInteger> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteTechnicianValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<IdInteger>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for editTechnician
     * @param body  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call editTechnicianCall(Technicians body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/technicians";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call editTechnicianValidateBeforeCall(Technicians body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling editTechnician(Async)");
        }
        
        com.squareup.okhttp.Call call = editTechnicianCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Edit one technician.
     * Edit one technician.
     * @param body  (required)
     * @return Technicians
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Technicians editTechnician(Technicians body) throws ApiException {
        ApiResponse<Technicians> resp = editTechnicianWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Edit one technician.
     * Edit one technician.
     * @param body  (required)
     * @return ApiResponse&lt;Technicians&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Technicians> editTechnicianWithHttpInfo(Technicians body) throws ApiException {
        com.squareup.okhttp.Call call = editTechnicianValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<Technicians>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Edit one technician. (asynchronously)
     * Edit one technician.
     * @param body  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call editTechnicianAsync(Technicians body, final ApiCallback<Technicians> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = editTechnicianValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Technicians>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getTechnicianById
     * @param id id to delete or search (required)
     * @param deleted Get all, deleted, not deleted data. Default not deleted. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getTechnicianByIdCall(Long id, Deleted deleted, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/technicians/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (deleted != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("deleted", deleted));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getTechnicianByIdValidateBeforeCall(Long id, Deleted deleted, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getTechnicianById(Async)");
        }
        
        com.squareup.okhttp.Call call = getTechnicianByIdCall(id, deleted, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get one technician.
     * Get one technician.
     * @param id id to delete or search (required)
     * @param deleted Get all, deleted, not deleted data. Default not deleted. (optional)
     * @return Technicians
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Technicians getTechnicianById(Long id, Deleted deleted) throws ApiException {
        ApiResponse<Technicians> resp = getTechnicianByIdWithHttpInfo(id, deleted);
        return resp.getData();
    }

    /**
     * Get one technician.
     * Get one technician.
     * @param id id to delete or search (required)
     * @param deleted Get all, deleted, not deleted data. Default not deleted. (optional)
     * @return ApiResponse&lt;Technicians&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Technicians> getTechnicianByIdWithHttpInfo(Long id, Deleted deleted) throws ApiException {
        com.squareup.okhttp.Call call = getTechnicianByIdValidateBeforeCall(id, deleted, null, null);
        Type localVarReturnType = new TypeToken<Technicians>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get one technician. (asynchronously)
     * Get one technician.
     * @param id id to delete or search (required)
     * @param deleted Get all, deleted, not deleted data. Default not deleted. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTechnicianByIdAsync(Long id, Deleted deleted, final ApiCallback<Technicians> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getTechnicianByIdValidateBeforeCall(id, deleted, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Technicians>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getTechnicians
     * @param skip number of item to skip (optional)
     * @param limit max records to return (optional)
     * @param orderBy order by property. (optional)
     * @param filterBy filter data. (optional)
     * @param deleted Get all, deleted, not deleted data. Default not deleted. (optional)
     * @param metadata If metadata is needed (for pagination controls) (optional)
     * @param refClient Data from a desired client (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getTechniciansCall(Integer skip, Integer limit, String orderBy, String filterBy, Deleted deleted, Boolean metadata, String refClient, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/technicians";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (skip != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("skip", skip));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (orderBy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("orderBy", orderBy));
        if (filterBy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("filterBy", filterBy));
        if (deleted != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("deleted", deleted));
        if (metadata != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("metadata", metadata));
        if (refClient != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("refClient", refClient));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getTechniciansValidateBeforeCall(Integer skip, Integer limit, String orderBy, String filterBy, Deleted deleted, Boolean metadata, String refClient, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getTechniciansCall(skip, limit, orderBy, filterBy, deleted, metadata, refClient, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get all technicians.
     * Get all technicians.
     * @param skip number of item to skip (optional)
     * @param limit max records to return (optional)
     * @param orderBy order by property. (optional)
     * @param filterBy filter data. (optional)
     * @param deleted Get all, deleted, not deleted data. Default not deleted. (optional)
     * @param metadata If metadata is needed (for pagination controls) (optional)
     * @param refClient Data from a desired client (optional)
     * @return InlineResponse2002
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse2002 getTechnicians(Integer skip, Integer limit, String orderBy, String filterBy, Deleted deleted, Boolean metadata, String refClient) throws ApiException {
        ApiResponse<InlineResponse2002> resp = getTechniciansWithHttpInfo(skip, limit, orderBy, filterBy, deleted, metadata, refClient);
        return resp.getData();
    }

    /**
     * Get all technicians.
     * Get all technicians.
     * @param skip number of item to skip (optional)
     * @param limit max records to return (optional)
     * @param orderBy order by property. (optional)
     * @param filterBy filter data. (optional)
     * @param deleted Get all, deleted, not deleted data. Default not deleted. (optional)
     * @param metadata If metadata is needed (for pagination controls) (optional)
     * @param refClient Data from a desired client (optional)
     * @return ApiResponse&lt;InlineResponse2002&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2002> getTechniciansWithHttpInfo(Integer skip, Integer limit, String orderBy, String filterBy, Deleted deleted, Boolean metadata, String refClient) throws ApiException {
        com.squareup.okhttp.Call call = getTechniciansValidateBeforeCall(skip, limit, orderBy, filterBy, deleted, metadata, refClient, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2002>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get all technicians. (asynchronously)
     * Get all technicians.
     * @param skip number of item to skip (optional)
     * @param limit max records to return (optional)
     * @param orderBy order by property. (optional)
     * @param filterBy filter data. (optional)
     * @param deleted Get all, deleted, not deleted data. Default not deleted. (optional)
     * @param metadata If metadata is needed (for pagination controls) (optional)
     * @param refClient Data from a desired client (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTechniciansAsync(Integer skip, Integer limit, String orderBy, String filterBy, Deleted deleted, Boolean metadata, String refClient, final ApiCallback<InlineResponse2002> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getTechniciansValidateBeforeCall(skip, limit, orderBy, filterBy, deleted, metadata, refClient, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2002>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
