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


case class IoK8sApiAutoscalingV1HorizontalPodAutoscalerSpec (
  /* upper limit for the number of pods that can be set by the autoscaler; cannot be smaller than MinReplicas. */
  maxReplicas: Integer,
  /* lower limit for the number of pods that can be set by the autoscaler, default 1. */
  minReplicas: Option[Integer],
  /* reference to scaled resource; horizontal pod autoscaler will learn the current resource consumption and will set the desired number of pods by using its Scale subresource. */
  scaleTargetRef: IoK8sApiAutoscalingV1CrossVersionObjectReference,
  /* target average CPU utilization (represented as a percentage of requested CPU) over all the pods; if not specified the default autoscaling policy will be used. */
  targetCPUUtilizationPercentage: Option[Integer]
)

