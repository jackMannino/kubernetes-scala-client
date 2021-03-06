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


case class IoK8sApiAutoscalingV2beta1HorizontalPodAutoscalerSpec (
  /* maxReplicas is the upper limit for the number of replicas to which the autoscaler can scale up. It cannot be less that minReplicas. */
  maxReplicas: Integer,
  /* metrics contains the specifications for which to use to calculate the desired replica count (the maximum replica count across all metrics will be used).  The desired replica count is calculated multiplying the ratio between the target value and the current value by the current number of pods.  Ergo, metrics used must decrease as the pod count is increased, and vice-versa.  See the individual metric source types for more information about how each type of metric must respond. */
  metrics: Option[List[IoK8sApiAutoscalingV2beta1MetricSpec]],
  /* minReplicas is the lower limit for the number of replicas to which the autoscaler can scale down. It defaults to 1 pod. */
  minReplicas: Option[Integer],
  /* scaleTargetRef points to the target resource to scale, and is used to the pods for which metrics should be collected, as well as to actually change the replica count. */
  scaleTargetRef: IoK8sApiAutoscalingV2beta1CrossVersionObjectReference
)

