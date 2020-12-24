fetch('http://localhost:9090/Flight-RestAPI/api/products')
    .then(response => response.json())
    .then(products => {
        console.log(products);
    })