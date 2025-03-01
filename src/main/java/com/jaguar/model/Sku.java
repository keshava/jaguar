// File generated from our OpenAPI spec
package com.jaguar.model;

import com.google.gson.annotations.SerializedName;
import com.jaguar.Jaguar;
import com.jaguar.exception.JaguarException;
import com.jaguar.net.ApiResource;
import com.jaguar.net.RequestOptions;
import com.jaguar.param.SkuCreateParams;
import com.jaguar.param.SkuListParams;
import com.jaguar.param.SkuRetrieveParams;
import com.jaguar.param.SkuUpdateParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Sku extends ApiResource implements HasId, MetadataStore<Sku> {
  /** Whether the SKU is available for purchase. */
  @SerializedName("active")
  Boolean active;

  /**
   * A dictionary of attributes and values for the attributes defined by the product. If, for
   * example, a product's attributes are {@code ["size", "gender"]}, a valid SKU has the following
   * dictionary of attributes: {@code {"size": "Medium", "gender": "Unisex"}}.
   */
  @SerializedName("attributes")
  Map<String, String> attributes;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /** Always true for a deleted object. */
  @SerializedName("deleted")
  Boolean deleted;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** The URL of an image for this SKU, meant to be displayable to the customer. */
  @SerializedName("image")
  String image;

  @SerializedName("inventory")
  Inventory inventory;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code sku}.
   */
  @SerializedName("object")
  String object;

  /** The dimensions of this SKU for shipping purposes. */
  @SerializedName("package_dimensions")
  PackageDimensions packageDimensions;

  /**
   * The cost of the item as a positive integer in the smallest currency unit (that is, 100 cents to
   * charge $1.00, or 100 to charge ¥100, Japanese Yen being a zero-decimal currency).
   */
  @SerializedName("price")
  Long price;

  /** The ID of the product this SKU is associated with. The product must be currently active. */
  @SerializedName("product")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Product> product;

  /** Time at which the object was last updated. Measured in seconds since the Unix epoch. */
  @SerializedName("updated")
  Long updated;

  /** Get ID of expandable {@code product} object. */
  public String getProduct() {
    return (this.product != null) ? this.product.getId() : null;
  }

  public void setProduct(String id) {
    this.product = ApiResource.setExpandableFieldId(id, this.product);
  }

  /** Get expanded {@code product}. */
  public Product getProductObject() {
    return (this.product != null) ? this.product.getExpanded() : null;
  }

  public void setProductObject(Product expandableObject) {
    this.product = new ExpandableField<Product>(expandableObject.getId(), expandableObject);
  }

  /**
   * Retrieves the details of an existing SKU. Supply the unique SKU identifier from either a SKU
   * creation request or from the product, and Stripe will return the corresponding SKU information.
   */
  public static Sku retrieve(String id) throws JaguarException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves the details of an existing SKU. Supply the unique SKU identifier from either a SKU
   * creation request or from the product, and Stripe will return the corresponding SKU information.
   */
  public static Sku retrieve(String id, RequestOptions options) throws JaguarException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves the details of an existing SKU. Supply the unique SKU identifier from either a SKU
   * creation request or from the product, and Stripe will return the corresponding SKU information.
   */
  public static Sku retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws JaguarException {
    String url =
        String.format(
            "%s%s", Jaguar.getApiBase(), String.format("/v1/skus/%s", ApiResource.urlEncodeId(id)));
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Sku.class, options);
  }

  /**
   * Retrieves the details of an existing SKU. Supply the unique SKU identifier from either a SKU
   * creation request or from the product, and Stripe will return the corresponding SKU information.
   */
  public static Sku retrieve(String id, SkuRetrieveParams params, RequestOptions options)
      throws JaguarException {
    String url =
        String.format(
            "%s%s", Jaguar.getApiBase(), String.format("/v1/skus/%s", ApiResource.urlEncodeId(id)));
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Sku.class, options);
  }

  /**
   * Returns a list of your SKUs. The SKUs are returned sorted by creation date, with the most
   * recently created SKUs appearing first.
   */
  public static SkuCollection list(Map<String, Object> params) throws JaguarException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of your SKUs. The SKUs are returned sorted by creation date, with the most
   * recently created SKUs appearing first.
   */
  public static SkuCollection list(Map<String, Object> params, RequestOptions options)
      throws JaguarException {
    String url = String.format("%s%s", Jaguar.getApiBase(), "/v1/skus");
    return ApiResource.requestCollection(url, params, SkuCollection.class, options);
  }

  /**
   * Returns a list of your SKUs. The SKUs are returned sorted by creation date, with the most
   * recently created SKUs appearing first.
   */
  public static SkuCollection list(SkuListParams params) throws JaguarException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of your SKUs. The SKUs are returned sorted by creation date, with the most
   * recently created SKUs appearing first.
   */
  public static SkuCollection list(SkuListParams params, RequestOptions options)
      throws JaguarException {
    String url = String.format("%s%s", Jaguar.getApiBase(), "/v1/skus");
    return ApiResource.requestCollection(url, params, SkuCollection.class, options);
  }

  /**
   * Updates the specific SKU by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   *
   * <p>Note that a SKU’s <code>attributes</code> are not editable. Instead, you would need to
   * deactivate the existing SKU and create a new one with the new attribute values.
   */
  @Override
  public Sku update(Map<String, Object> params) throws JaguarException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specific SKU by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   *
   * <p>Note that a SKU’s <code>attributes</code> are not editable. Instead, you would need to
   * deactivate the existing SKU and create a new one with the new attribute values.
   */
  @Override
  public Sku update(Map<String, Object> params, RequestOptions options) throws JaguarException {
    String url =
        String.format(
            "%s%s",
            Jaguar.getApiBase(),
            String.format("/v1/skus/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Sku.class, options);
  }

  /**
   * Updates the specific SKU by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   *
   * <p>Note that a SKU’s <code>attributes</code> are not editable. Instead, you would need to
   * deactivate the existing SKU and create a new one with the new attribute values.
   */
  public Sku update(SkuUpdateParams params) throws JaguarException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specific SKU by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   *
   * <p>Note that a SKU’s <code>attributes</code> are not editable. Instead, you would need to
   * deactivate the existing SKU and create a new one with the new attribute values.
   */
  public Sku update(SkuUpdateParams params, RequestOptions options) throws JaguarException {
    String url =
        String.format(
            "%s%s",
            Jaguar.getApiBase(),
            String.format("/v1/skus/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Sku.class, options);
  }

  /** Creates a new SKU associated with a product. */
  public static Sku create(Map<String, Object> params) throws JaguarException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new SKU associated with a product. */
  public static Sku create(Map<String, Object> params, RequestOptions options)
      throws JaguarException {
    String url = String.format("%s%s", Jaguar.getApiBase(), "/v1/skus");
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Sku.class, options);
  }

  /** Creates a new SKU associated with a product. */
  public static Sku create(SkuCreateParams params) throws JaguarException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new SKU associated with a product. */
  public static Sku create(SkuCreateParams params, RequestOptions options) throws JaguarException {
    String url = String.format("%s%s", Jaguar.getApiBase(), "/v1/skus");
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Sku.class, options);
  }

  /** Delete a SKU. Deleting a SKU is only possible until it has been used in an order. */
  public Sku delete() throws JaguarException {
    return delete((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Delete a SKU. Deleting a SKU is only possible until it has been used in an order. */
  public Sku delete(RequestOptions options) throws JaguarException {
    return delete((Map<String, Object>) null, options);
  }

  /** Delete a SKU. Deleting a SKU is only possible until it has been used in an order. */
  public Sku delete(Map<String, Object> params) throws JaguarException {
    return delete(params, (RequestOptions) null);
  }

  /** Delete a SKU. Deleting a SKU is only possible until it has been used in an order. */
  public Sku delete(Map<String, Object> params, RequestOptions options) throws JaguarException {
    String url =
        String.format(
            "%s%s",
            Jaguar.getApiBase(),
            String.format("/v1/skus/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.DELETE, url, params, Sku.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Inventory extends JaguarObject {
    /**
     * The count of inventory available. Will be present if and only if {@code type} is {@code
     * finite}.
     */
    @SerializedName("quantity")
    Long quantity;

    /**
     * Inventory type. Possible values are {@code finite}, {@code bucket} (not quantified), and
     * {@code infinite}.
     */
    @SerializedName("type")
    String type;

    /**
     * An indicator of the inventory available. Possible values are {@code in_stock}, {@code
     * limited}, and {@code out_of_stock}. Will be present if and only if {@code type} is {@code
     * bucket}.
     */
    @SerializedName("value")
    String value;
  }
}
