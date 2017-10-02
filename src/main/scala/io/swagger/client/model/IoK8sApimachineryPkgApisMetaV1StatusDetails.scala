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


case class IoK8sApimachineryPkgApisMetaV1StatusDetails (
  /* The Causes array includes more details associated with the StatusReason failure. Not all StatusReasons may provide detailed causes. */
  causes: Option[List[IoK8sApimachineryPkgApisMetaV1StatusCause]],
  /* The group attribute of the resource associated with the status StatusReason. */
  group: Option[String],
  /* The kind attribute of the resource associated with the status StatusReason. On some operations may differ from the requested resource Kind. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds */
  kind: Option[String],
  /* The name attribute of the resource associated with the status StatusReason (when there is a single name which can be described). */
  name: Option[String],
  /* If specified, the time in seconds before the operation should be retried. Some errors may indicate the client must take an alternate action - for those errors this field may indicate how long to wait before taking the alternate action. */
  retryAfterSeconds: Option[Integer],
  /* UID of the resource. (when there is a single resource which can be described). More info: http://kubernetes.io/docs/user-guide/identifiers#uids */
  uid: Option[String]
)
