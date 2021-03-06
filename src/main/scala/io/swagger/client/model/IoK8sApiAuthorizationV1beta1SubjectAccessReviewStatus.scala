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


case class IoK8sApiAuthorizationV1beta1SubjectAccessReviewStatus (
  /* Allowed is required.  True if the action would be allowed, false otherwise. */
  allowed: Boolean,
  /* EvaluationError is an indication that some error occurred during the authorization check. It is entirely possible to get an error and be able to continue determine authorization status in spite of it. For instance, RBAC can be missing a role, but enough roles are still present and bound to reason about the request. */
  evaluationError: Option[String],
  /* Reason is optional.  It indicates why a request was allowed or denied. */
  reason: Option[String]
)

