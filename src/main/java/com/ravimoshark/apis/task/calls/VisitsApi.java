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
import java.util.Date;
import com.ravimoshark.apis.task.model.Deleted;
import com.ravimoshark.apis.task.model.IdInteger;
import com.ravimoshark.apis.task.model.InlineResponse2003;
import com.ravimoshark.apis.task.model.Visits;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VisitsApi {
    private ApiClient apiClient;

    public VisitsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public VisitsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for addVisit
     * @param body  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addVisitCall(Visits body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/visits";

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
    private com.squareup.okhttp.Call addVisitValidateBeforeCall(Visits body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling addVisit(Async)");
        }
        
        com.squareup.okhttp.Call call = addVisitCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Add one visit.
     * Add one visit.
     * @param body  (required)
     * @return Visits
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Visits addVisit(Visits body) throws ApiException {
        ApiResponse<Visits> resp = addVisitWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Add one visit.
     * Add one visit.
     * @param body  (required)
     * @return ApiResponse&lt;Visits&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Visits> addVisitWithHttpInfo(Visits body) throws ApiException {
        com.squareup.okhttp.Call call = addVisitValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<Visits>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Add one visit. (asynchronously)
     * Add one visit.
     * @param body  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addVisitAsync(Visits body, final ApiCallback<Visits> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addVisitValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Visits>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteVisit
     * @param id id to delete or search (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteVisitCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/visits/{id}"
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
    private com.squareup.okhttp.Call deleteVisitValidateBeforeCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteVisit(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteVisitCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete one visit.
     * Delete one visit.
     * @param id id to delete or search (required)
     * @return IdInteger
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public IdInteger deleteVisit(Long id) throws ApiException {
        ApiResponse<IdInteger> resp = deleteVisitWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Delete one visit.
     * Delete one visit.
     * @param id id to delete or search (required)
     * @return ApiResponse&lt;IdInteger&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<IdInteger> deleteVisitWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = deleteVisitValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<IdInteger>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete one visit. (asynchronously)
     * Delete one visit.
     * @param id id to delete or search (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteVisitAsync(Long id, final ApiCallback<IdInteger> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteVisitValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<IdInteger>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for editVisit
     * @param body  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call editVisitCall(Visits body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/visits";

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
    private com.squareup.okhttp.Call editVisitValidateBeforeCall(Visits body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling editVisit(Async)");
        }
        
        com.squareup.okhttp.Call call = editVisitCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Edit one visit.
     * Edit one visit.
     * @param body  (required)
     * @return Visits
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Visits editVisit(Visits body) throws ApiException {
        ApiResponse<Visits> resp = editVisitWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Edit one visit.
     * Edit one visit.
     * @param body  (required)
     * @return ApiResponse&lt;Visits&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Visits> editVisitWithHttpInfo(Visits body) throws ApiException {
        com.squareup.okhttp.Call call = editVisitValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<Visits>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Edit one visit. (asynchronously)
     * Edit one visit.
     * @param body  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call editVisitAsync(Visits body, final ApiCallback<Visits> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = editVisitValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Visits>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getVisitById
     * @param id id to delete or search (required)
     * @param deleted Get all, deleted, not deleted data. Default not deleted. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getVisitByIdCall(Long id, Deleted deleted, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/visits/{id}"
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
    private com.squareup.okhttp.Call getVisitByIdValidateBeforeCall(Long id, Deleted deleted, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getVisitById(Async)");
        }
        
        com.squareup.okhttp.Call call = getVisitByIdCall(id, deleted, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get one visit.
     * Get one visit.
     * @param id id to delete or search (required)
     * @param deleted Get all, deleted, not deleted data. Default not deleted. (optional)
     * @return Visits
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Visits getVisitById(Long id, Deleted deleted) throws ApiException {
        ApiResponse<Visits> resp = getVisitByIdWithHttpInfo(id, deleted);
        return resp.getData();
    }

    /**
     * Get one visit.
     * Get one visit.
     * @param id id to delete or search (required)
     * @param deleted Get all, deleted, not deleted data. Default not deleted. (optional)
     * @return ApiResponse&lt;Visits&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Visits> getVisitByIdWithHttpInfo(Long id, Deleted deleted) throws ApiException {
        com.squareup.okhttp.Call call = getVisitByIdValidateBeforeCall(id, deleted, null, null);
        Type localVarReturnType = new TypeToken<Visits>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get one visit. (asynchronously)
     * Get one visit.
     * @param id id to delete or search (required)
     * @param deleted Get all, deleted, not deleted data. Default not deleted. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getVisitByIdAsync(Long id, Deleted deleted, final ApiCallback<Visits> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getVisitByIdValidateBeforeCall(id, deleted, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Visits>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getVisits
     * @param skip number of item to skip (optional)
     * @param limit max records to return (optional)
     * @param orderBy order by property. (optional)
     * @param filterBy filter data. (optional)
     * @param deleted Get all, deleted, not deleted data. Default not deleted. (optional)
     * @param metadata If metadata is needed (for pagination controls) (optional)
     * @param refClient Data from a desired client (optional)
     * @param technicianId Id from a desired technician (optional)
     * @param dateFrom Date from (optional)
     * @param dateUntil Date until (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getVisitsCall(Integer skip, Integer limit, String orderBy, String filterBy, Deleted deleted, Boolean metadata, String refClient, Long technicianId, Date dateFrom, Date dateUntil, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/visits";

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
        if (technicianId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("technicianId", technicianId));
        if (dateFrom != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("dateFrom", dateFrom));
        if (dateUntil != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("dateUntil", dateUntil));

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
    private com.squareup.okhttp.Call getVisitsValidateBeforeCall(Integer skip, Integer limit, String orderBy, String filterBy, Deleted deleted, Boolean metadata, String refClient, Long technicianId, Date dateFrom, Date dateUntil, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getVisitsCall(skip, limit, orderBy, filterBy, deleted, metadata, refClient, technicianId, dateFrom, dateUntil, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get all visits.
     * Get all visits.
     * @param skip number of item to skip (optional)
     * @param limit max records to return (optional)
     * @param orderBy order by property. (optional)
     * @param filterBy filter data. (optional)
     * @param deleted Get all, deleted, not deleted data. Default not deleted. (optional)
     * @param metadata If metadata is needed (for pagination controls) (optional)
     * @param refClient Data from a desired client (optional)
     * @param technicianId Id from a desired technician (optional)
     * @param dateFrom Date from (optional)
     * @param dateUntil Date until (optional)
     * @return InlineResponse2003
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse2003 getVisits(Integer skip, Integer limit, String orderBy, String filterBy, Deleted deleted, Boolean metadata, String refClient, Long technicianId, Date dateFrom, Date dateUntil) throws ApiException {
        ApiResponse<InlineResponse2003> resp = getVisitsWithHttpInfo(skip, limit, orderBy, filterBy, deleted, metadata, refClient, technicianId, dateFrom, dateUntil);
        return resp.getData();
    }

    /**
     * Get all visits.
     * Get all visits.
     * @param skip number of item to skip (optional)
     * @param limit max records to return (optional)
     * @param orderBy order by property. (optional)
     * @param filterBy filter data. (optional)
     * @param deleted Get all, deleted, not deleted data. Default not deleted. (optional)
     * @param metadata If metadata is needed (for pagination controls) (optional)
     * @param refClient Data from a desired client (optional)
     * @param technicianId Id from a desired technician (optional)
     * @param dateFrom Date from (optional)
     * @param dateUntil Date until (optional)
     * @return ApiResponse&lt;InlineResponse2003&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2003> getVisitsWithHttpInfo(Integer skip, Integer limit, String orderBy, String filterBy, Deleted deleted, Boolean metadata, String refClient, Long technicianId, Date dateFrom, Date dateUntil) throws ApiException {
        com.squareup.okhttp.Call call = getVisitsValidateBeforeCall(skip, limit, orderBy, filterBy, deleted, metadata, refClient, technicianId, dateFrom, dateUntil, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2003>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get all visits. (asynchronously)
     * Get all visits.
     * @param skip number of item to skip (optional)
     * @param limit max records to return (optional)
     * @param orderBy order by property. (optional)
     * @param filterBy filter data. (optional)
     * @param deleted Get all, deleted, not deleted data. Default not deleted. (optional)
     * @param metadata If metadata is needed (for pagination controls) (optional)
     * @param refClient Data from a desired client (optional)
     * @param technicianId Id from a desired technician (optional)
     * @param dateFrom Date from (optional)
     * @param dateUntil Date until (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getVisitsAsync(Integer skip, Integer limit, String orderBy, String filterBy, Deleted deleted, Boolean metadata, String refClient, Long technicianId, Date dateFrom, Date dateUntil, final ApiCallback<InlineResponse2003> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getVisitsValidateBeforeCall(skip, limit, orderBy, filterBy, deleted, metadata, refClient, technicianId, dateFrom, dateUntil, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2003>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
