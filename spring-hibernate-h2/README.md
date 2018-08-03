-----------------------------------------------------------------------------------------
GET: http://localhost:8580/company/1

{
  "id": 1,
  "name": "NEWCOMPANY2",
  "departments": [
    {
      "id": 2,
      "name": "NEWDEPARTMENT1",
      "employees": [
        {
          "id": 3,
          "name": "NEWEMPNAME",
          "surname": "NEWEMPSURNAME",
          "address": {
            "id": 4,
            "street": "NEWSTREET1",
            "houseNumber": "NEWHOUSE1",
            "zipCode": "444444"
          }
        }
      ],
      "offices": [
        {
          "id": 5,
          "name": "NEWOFFICE1",
          "address": {
            "id": 6,
            "street": "NEWSTREET2",
            "houseNumber": "NEWHOUSE2",
            "zipCode": "555555"
          }
        }
      ]
    }
  ],
  "cars": []
}
-----------------------------------------------------------------------------------------

GET: http://localhost:8580/company

[
  {
    "id": 1,
    "name": "NEWCOMPANY2-UPDT",
    "departments": [
      {
        "id": 2,
        "name": "NEWDEPARTMENT1-UPDT",
        "employees": [
          {
            "id": 3,
            "name": "NEWEMPNAME-UPDT",
            "surname": "NEWEMPSURNAME-UPDT",
            "address": {
              "id": 4,
              "street": "NEWSTREET1",
              "houseNumber": "NEWHOUSE1",
              "zipCode": "444444"
            }
          }
        ],
        "offices": [
          {
            "id": 5,
            "name": "NEWOFFICE1-UPDT",
            "address": {
              "id": 6,
              "street": "NEWSTREET2",
              "houseNumber": "NEWHOUSE2",
              "zipCode": "555555"
            }
          }
        ]
      }
    ],
    "cars": []
  }
]

-----------------------------------------------------------------------------------------

POST: http://localhost:8580/company

{
  "departments": [
    {
      "employees": [
        {
          "address": {
            "houseNumber": "NEWHOUSE1",
            "id": null,
            "street": "NEWSTREET1",
            "zipCode": "444444"
          },
          "id": null,
          "name": "NEWEMPNAME",
          "surname": "NEWEMPSURNAME"
        }
      ],
      "id": null,
      "name": "NEWDEPARTMENT1",
      "offices": [
        {
          "address": {
            "houseNumber": "NEWHOUSE2",
            "id": null,
            "street": "NEWSTREET2",
            "zipCode": "555555"
          },
          "id": null,
          "name": "NEWOFFICE1"
        }
      ]
    }
  ],
  "id": null,
  "name": "NEWCOMPANY2"
}

-----------------------------------------------------------------------------------------
PUT: http://localhost:8580/company

{
  "id": 1,
  "name": "NEWCOMPANY2-UPDT",
  "departments": [
    {
      "id": 2,
      "name": "NEWDEPARTMENT1-UPDT",
      "employees": [
        {
          "id": 3,
          "name": "NEWEMPNAME-UPDT",
          "surname": "NEWEMPSURNAME-UPDT",
          "address": {
            "id": 4,
            "street": "NEWSTREET1",
            "houseNumber": "NEWHOUSE1",
            "zipCode": "444444"
          }
        }
      ],
      "offices": [
        {
          "id": 5,
          "name": "NEWOFFICE1-UPDT",
          "address": {
            "id": 6,
            "street": "NEWSTREET2",
            "houseNumber": "NEWHOUSE2",
            "zipCode": "555555"
          }
        }
      ]
    }
  ],
  "cars": []
}
  
-----------------------------------------------------------------------------------------
DELETE; http://localhost:8580/company/7

status 200
