
package org.soap.controller;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.soap.controller package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetProduct_QNAME = new QName("http://controller.soap.org/", "getProduct");
    private final static QName _GetProductResponse_QNAME = new QName("http://controller.soap.org/", "getProductResponse");
    private final static QName _AddProduct_QNAME = new QName("http://controller.soap.org/", "addProduct");
    private final static QName _ProductDetails_QNAME = new QName("http://controller.soap.org/", "ProductDetails");
    private final static QName _GetProductV2Response_QNAME = new QName("http://controller.soap.org/", "getProductV2Response");
    private final static QName _DeleteITResponse_QNAME = new QName("http://controller.soap.org/", "deleteITResponse");
    private final static QName _AddProductResponse_QNAME = new QName("http://controller.soap.org/", "addProductResponse");
    private final static QName _GetProductCategories_QNAME = new QName("http://controller.soap.org/", "getProductCategories");
    private final static QName _GetProductCategoriesResponse_QNAME = new QName("http://controller.soap.org/", "getProductCategoriesResponse");
    private final static QName _DeleteIT_QNAME = new QName("http://controller.soap.org/", "deleteIT");
    private final static QName _GetProductV2_QNAME = new QName("http://controller.soap.org/", "getProductV2");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.soap.controller
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetProduct }
     * 
     */
    public GetProduct createGetProduct() {
        return new GetProduct();
    }

    /**
     * Create an instance of {@link GetProductResponse }
     * 
     */
    public GetProductResponse createGetProductResponse() {
        return new GetProductResponse();
    }

    /**
     * Create an instance of {@link AddProduct }
     * 
     */
    public AddProduct createAddProduct() {
        return new AddProduct();
    }

    /**
     * Create an instance of {@link ProductDetails }
     * 
     */
    public ProductDetails createProductDetails() {
        return new ProductDetails();
    }

    /**
     * Create an instance of {@link GetProductV2Response }
     * 
     */
    public GetProductV2Response createGetProductV2Response() {
        return new GetProductV2Response();
    }

    /**
     * Create an instance of {@link DeleteITResponse }
     * 
     */
    public DeleteITResponse createDeleteITResponse() {
        return new DeleteITResponse();
    }

    /**
     * Create an instance of {@link AddProductResponse }
     * 
     */
    public AddProductResponse createAddProductResponse() {
        return new AddProductResponse();
    }

    /**
     * Create an instance of {@link GetProductCategories }
     * 
     */
    public GetProductCategories createGetProductCategories() {
        return new GetProductCategories();
    }

    /**
     * Create an instance of {@link GetProductCategoriesResponse }
     * 
     */
    public GetProductCategoriesResponse createGetProductCategoriesResponse() {
        return new GetProductCategoriesResponse();
    }

    /**
     * Create an instance of {@link DeleteIT }
     * 
     */
    public DeleteIT createDeleteIT() {
        return new DeleteIT();
    }

    /**
     * Create an instance of {@link GetProductV2 }
     * 
     */
    public GetProductV2 createGetProductV2() {
        return new GetProductV2();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.soap.org/", name = "getProduct")
    public JAXBElement<GetProduct> createGetProduct(GetProduct value) {
        return new JAXBElement<GetProduct>(_GetProduct_QNAME, GetProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.soap.org/", name = "getProductResponse")
    public JAXBElement<GetProductResponse> createGetProductResponse(GetProductResponse value) {
        return new JAXBElement<GetProductResponse>(_GetProductResponse_QNAME, GetProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.soap.org/", name = "addProduct")
    public JAXBElement<AddProduct> createAddProduct(AddProduct value) {
        return new JAXBElement<AddProduct>(_AddProduct_QNAME, AddProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.soap.org/", name = "ProductDetails")
    public JAXBElement<ProductDetails> createProductDetails(ProductDetails value) {
        return new JAXBElement<ProductDetails>(_ProductDetails_QNAME, ProductDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductV2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.soap.org/", name = "getProductV2Response")
    public JAXBElement<GetProductV2Response> createGetProductV2Response(GetProductV2Response value) {
        return new JAXBElement<GetProductV2Response>(_GetProductV2Response_QNAME, GetProductV2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteITResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.soap.org/", name = "deleteITResponse")
    public JAXBElement<DeleteITResponse> createDeleteITResponse(DeleteITResponse value) {
        return new JAXBElement<DeleteITResponse>(_DeleteITResponse_QNAME, DeleteITResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.soap.org/", name = "addProductResponse")
    public JAXBElement<AddProductResponse> createAddProductResponse(AddProductResponse value) {
        return new JAXBElement<AddProductResponse>(_AddProductResponse_QNAME, AddProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductCategories }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.soap.org/", name = "getProductCategories")
    public JAXBElement<GetProductCategories> createGetProductCategories(GetProductCategories value) {
        return new JAXBElement<GetProductCategories>(_GetProductCategories_QNAME, GetProductCategories.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductCategoriesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.soap.org/", name = "getProductCategoriesResponse")
    public JAXBElement<GetProductCategoriesResponse> createGetProductCategoriesResponse(GetProductCategoriesResponse value) {
        return new JAXBElement<GetProductCategoriesResponse>(_GetProductCategoriesResponse_QNAME, GetProductCategoriesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteIT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.soap.org/", name = "deleteIT")
    public JAXBElement<DeleteIT> createDeleteIT(DeleteIT value) {
        return new JAXBElement<DeleteIT>(_DeleteIT_QNAME, DeleteIT.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductV2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.soap.org/", name = "getProductV2")
    public JAXBElement<GetProductV2> createGetProductV2(GetProductV2 value) {
        return new JAXBElement<GetProductV2>(_GetProductV2_QNAME, GetProductV2 .class, null, value);
    }

}
