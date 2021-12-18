// Generated by com.stripe.generator.entity.SdkBuilder

package com.jaguar.param;

import com.google.gson.annotations.SerializedName;
import com.jaguar.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

public class BankAccountUpdateOnCustomerParams extends ApiRequestParams {
  /** The name of the person or business that owns the bank account. */
  @SerializedName("account_holder_name")
  String accountHolderName;

  /** The type of entity that holds the account. This can be either `individual` or `company`. */
  @SerializedName("account_holder_type")
  AccountHolderType accountHolderType;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  @SerializedName("metadata")
  Map<String, String> metadata;

  private BankAccountUpdateOnCustomerParams(
      String accountHolderName,
      AccountHolderType accountHolderType,
      List<String> expand,
      Map<String, Object> extraParams,
      Map<String, String> metadata) {
    this.accountHolderName = accountHolderName;
    this.accountHolderType = accountHolderType;
    this.expand = expand;
    this.extraParams = extraParams;
    this.metadata = metadata;
  }

  public static Builder builder() {
    return new com.jaguar.param.BankAccountUpdateOnCustomerParams.Builder();
  }

  public static class Builder {
    private String accountHolderName;

    private AccountHolderType accountHolderType;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Map<String, String> metadata;

    /** Finalize and obtain parameter instance from this builder. */
    public BankAccountUpdateOnCustomerParams build() {
      return new BankAccountUpdateOnCustomerParams(
          this.accountHolderName,
          this.accountHolderType,
          this.expand,
          this.extraParams,
          this.metadata);
    }

    /** The name of the person or business that owns the bank account. */
    public Builder setAccountHolderName(String accountHolderName) {
      this.accountHolderName = accountHolderName;
      return this;
    }

    /** The type of entity that holds the account. This can be either `individual` or `company`. */
    public Builder setAccountHolderType(AccountHolderType accountHolderType) {
      this.accountHolderType = accountHolderType;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * BankAccountUpdateOnCustomerParams#expand} for the field documentation.
     */
    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * BankAccountUpdateOnCustomerParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * BankAccountUpdateOnCustomerParams#extraParams} for the field documentation.
     */
    public Builder putExtraParam(String key, Object value) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link BankAccountUpdateOnCustomerParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * BankAccountUpdateOnCustomerParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link BankAccountUpdateOnCustomerParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }
  }

  public enum AccountHolderType implements ApiRequestParams.EnumParam {
    @SerializedName("company")
    COMPANY("company"),

    @SerializedName("individual")
    INDIVIDUAL("individual");

    @Getter(onMethod_ = {@Override})
    private final String value;

    AccountHolderType(String value) {
      this.value = value;
    }
  }
}
