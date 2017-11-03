http://localhost:8085/products/

[
    {
        "id": "1",
        "title": "Laptop",
        "maker": {
            "id": "Lenovo",
            "name": "Lenovo"
        },
        "stockLevel": 2,
        "links": [
            {
                "rel": "self",
                "href": "http://localhost:8085/product/1"
            },
            {
                "rel": "product",
                "href": "http://localhost:8085/maker/Lenovo"
            },
            {
                "rel": "product.purchase",
                "href": "http://localhost:8085/product/purchase/1"
            }
        ]
    },
    {
        "id": "2",
        "title": "Keyboard",
        "maker": {
            "id": "Lenovo",
            "name": "Lenovo"
        },
        "stockLevel": 3,
        "links": [
            {
                "rel": "self",
                "href": "http://localhost:8085/product/2"
            },
            {
                "rel": "product",
                "href": "http://localhost:8085/maker/Lenovo"
            },
            {
                "rel": "product.purchase",
                "href": "http://localhost:8085/product/purchase/2"
            }
        ]
    },
    {
        "id": "3",
        "title": "Mouse",
        "maker": {
            "id": "Lenovo",
            "name": "Lenovo"
        },
        "stockLevel": 0,
        "links": [
            {
                "rel": "self",
                "href": "http://localhost:8085/product/3"
            },
            {
                "rel": "product",
                "href": "http://localhost:8085/maker/Lenovo"
            }
        ]
    },
    {
        "id": "4",
        "title": "MacBook Pro",
        "maker": {
            "id": "Apple",
            "name": "Apple"
        },
        "stockLevel": 1,
        "links": [
            {
                "rel": "self",
                "href": "http://localhost:8085/product/4"
            },
            {
                "rel": "product",
                "href": "http://localhost:8085/maker/Apple"
            },
            {
                "rel": "product.purchase",
                "href": "http://localhost:8085/product/purchase/4"
            }
        ]
    }
]





http://localhost:8085/product/1

{
    "id": "1",
    "title": "Laptop",
    "maker": {
        "id": "Lenovo",
        "name": "Lenovo"
    },
    "stockLevel": 2,
    "links": [
        {
            "rel": "self",
            "href": "http://localhost:8085/product/1"
        },
        {
            "rel": "product",
            "href": "http://localhost:8085/maker/Lenovo"
        },
        {
            "rel": "product.purchase",
            "href": "http://localhost:8085/product/purchase/1"
        }
    ]
}





http://localhost:8085/maker/Lenovo

{
    "id": "Lenovo",
    "name": "Lenovo",
    "links": [
        {
            "rel": "self",
            "href": "http://localhost:8085/maker/Lenovo"
        }
    ]
}





http://localhost:8085/product/purchase/1

{
    "id": "1",
    "title": "Laptop",
    "maker": {
        "id": "Lenovo",
        "name": "Lenovo"
    },
    "stockLevel": 1,
    "links": [
        {
            "rel": "self",
            "href": "http://localhost:8085/product/1"
        }
    ]
}






http://localhost:8085/product/3

{
    "id": "3",
    "title": "Mouse",
    "maker": {
        "id": "Lenovo",
        "name": "Lenovo"
    },
    "stockLevel": 0,
    "links": [
        {
            "rel": "self",
            "href": "http://localhost:8085/product/3"
        },
        {
            "rel": "product",
            "href": "http://localhost:8085/maker/Lenovo"
        }
    ]
}





http://localhost:8085/product/purchase/3

{
    "id": "3",
    "title": "Mouse",
    "maker": {
        "id": "Lenovo",
        "name": "Lenovo"
    },
    "stockLevel": -1,
    "links": [
        {
            "rel": "self",
            "href": "http://localhost:8085/product/3"
        }
    ]
}