/**
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.9.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model


case class IoK8sApiAuthorizationV1ResourceAttributes (
  /* Group is the API Group of the Resource.  \"*\" means all. */
  group: Option[String],
  /* Name is the name of the resource being requested for a \"get\" or deleted for a \"delete\". \"\" (empty) means all. */
  name: Option[String],
  /* Namespace is the namespace of the action being requested.  Currently, there is no distinction between no namespace and all namespaces \"\" (empty) is defaulted for LocalSubjectAccessReviews \"\" (empty) is empty for cluster-scoped resources \"\" (empty) means \"all\" for namespace scoped resources from a SubjectAccessReview or SelfSubjectAccessReview */
  namespace: Option[String],
  /* Resource is one of the existing resource types.  \"*\" means all. */
  resource: Option[String],
  /* Subresource is one of the existing resource types.  \"\" means none. */
  subresource: Option[String],
  /* Verb is a kubernetes resource API verb, like: get, list, watch, create, update, delete, proxy.  \"*\" means all. */
  verb: Option[String],
  /* Version is the API Version of the Resource.  \"*\" means all. */
  version: Option[String]
)

