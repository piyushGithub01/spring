-----------------------------------------------------------------------------------------
GET: http://localhost:8580/company/1

{
	"id": 1,
	"name": "Pepsi",
	"departments": [
		{
			"id": 3,
			"name": "Administration",
			"employees": [
				{
					"id": 3,
					"name": "Donald",
					"surname": "Tyler",
					"address": {
						"id": 3,
						"street": "Street Z",
						"houseNumber": "3",
						"zipCode": "12-343",
						"handler": {},
						"hibernateLazyInitializer": {}
					}
				}
			],
			"offices": [
				{
					"id": 4,
					"name": "Office of A Los Angeles",
					"address": {
						"id": 7,
						"street": "Street XXX",
						"houseNumber": "7",
						"zipCode": "12-347",
						"handler": {},
						"hibernateLazyInitializer": {}
					}
				}
			]
		},
		{
			"id": 1,
			"name": "Sales & Marketing",
			"employees": [
				{
					"id": 1,
					"name": "John",
					"surname": "William",
					"address": {
						"id": 1,
						"street": "Street X",
						"houseNumber": "1",
						"zipCode": "12-341",
						"handler": {},
						"hibernateLazyInitializer": {}
					}
				}
			],
			"offices": [
				{
					"id": 1,
					"name": "Office of S&M Boston",
					"address": {
						"id": 4,
						"street": "Street XX",
						"houseNumber": "4",
						"zipCode": "12-344",
						"handler": {},
						"hibernateLazyInitializer": {}
					}
				},
				{
					"id": 2,
					"name": "Office of S&M New York",
					"address": {
						"id": 5,
						"street": "Street YY",
						"houseNumber": "5",
						"zipCode": "12-345",
						"handler": {},
						"hibernateLazyInitializer": {}
					}
				}
			]
		},
		{
			"id": 2,
			"name": "Research & Development",
			"employees": [
				{
					"id": 2,
					"name": "Robert",
					"surname": "James",
					"address": {
						"id": 2,
						"street": "Street Y",
						"houseNumber": "2",
						"zipCode": "12-342",
						"handler": {},
						"hibernateLazyInitializer": {}
					}
				}
			],
			"offices": [
				{
					"id": 3,
					"name": "Office of R&D Boston",
					"address": {
						"id": 6,
						"street": "Street ZZ",
						"houseNumber": "6",
						"zipCode": "12-346",
						"handler": {},
						"hibernateLazyInitializer": {}
					}
				}
			]
		}
	],
	"cars": [
		{
			"id": 1,
			"registrationNumber": "XYZ10ABC"
		},
		{
			"id": 3,
			"registrationNumber": "XYZ12ABC"
		},
		{
			"id": 2,
			"registrationNumber": "XYZ11ABC"
		}
	]
}
-----------------------------------------------------------------------------------------

GET: http://localhost:8580/company

[
  {
    "id": 1,
    "name": "Pepsi",
    "departments": [
      {
        "id": 3,
        "name": "Administration",
        "employees": [
          {
            "id": 3,
            "name": "Donald",
            "surname": "Tyler",
            "address": {
              "id": 3,
              "street": "Street Z",
              "houseNumber": "3",
              "zipCode": "12-343",
              "handler": {},
              "hibernateLazyInitializer": {}
            }
          }
        ],
        "offices": [
          {
            "id": 4,
            "name": "Office of A Los Angeles",
            "address": {
              "id": 7,
              "street": "Street XXX",
              "houseNumber": "7",
              "zipCode": "12-347",
              "handler": {},
              "hibernateLazyInitializer": {}
            }
          }
        ]
      },
      {
        "id": 2,
        "name": "Research & Development",
        "employees": [
          {
            "id": 2,
            "name": "Robert",
            "surname": "James",
            "address": {
              "id": 2,
              "street": "Street Y",
              "houseNumber": "2",
              "zipCode": "12-342",
              "handler": {},
              "hibernateLazyInitializer": {}
            }
          }
        ],
        "offices": [
          {
            "id": 3,
            "name": "Office of R&D Boston",
            "address": {
              "id": 6,
              "street": "Street ZZ",
              "houseNumber": "6",
              "zipCode": "12-346",
              "handler": {},
              "hibernateLazyInitializer": {}
            }
          }
        ]
      },
      {
        "id": 1,
        "name": "Sales & Marketing",
        "employees": [
          {
            "id": 1,
            "name": "John",
            "surname": "William",
            "address": {
              "id": 1,
              "street": "Street X",
              "houseNumber": "1",
              "zipCode": "12-341",
              "handler": {},
              "hibernateLazyInitializer": {}
            }
          }
        ],
        "offices": [
          {
            "id": 1,
            "name": "Office of S&M Boston",
            "address": {
              "id": 4,
              "street": "Street XX",
              "houseNumber": "4",
              "zipCode": "12-344",
              "handler": {},
              "hibernateLazyInitializer": {}
            }
          },
          {
            "id": 2,
            "name": "Office of S&M New York",
            "address": {
              "id": 5,
              "street": "Street YY",
              "houseNumber": "5",
              "zipCode": "12-345",
              "handler": {},
              "hibernateLazyInitializer": {}
            }
          }
        ]
      }
    ],
    "cars": [
      {
        "id": 2,
        "registrationNumber": "XYZ11ABC"
      },
      {
        "id": 1,
        "registrationNumber": "XYZ10ABC"
      },
      {
        "id": 3,
        "registrationNumber": "XYZ12ABC"
      }
    ]
  },
  {
    "id": 2,
    "name": "Coca Cola",
    "departments": [
      {
        "id": 4,
        "name": "Human Resources",
        "employees": [],
        "offices": []
      }
    ],
    "cars": [
      {
        "id": 4,
        "registrationNumber": "XYZ13ABC"
      }
    ]
  },
  {
    "id": 3,
    "name": "Sprite",
    "departments": [
      {
        "id": 5,
        "name": "Sales & Marketing",
        "employees": [],
        "offices": []
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
            "id": 0,
            "street": "NEWSTREET1",
            "zipCode": "444444"
          },
          "id": 0,
          "name": "NEWEMPNAME",
          "surname": "NEWEMPSURNAME"
        }
      ],
      "id": 0,
      "name": "NEWDEPARTMENT1",
      "offices": [
        {
          "address": {
            "houseNumber": "NEWHOUSE2",
            "id": 0,
            "street": "NEWSTREET2",
            "zipCode": "555555"
          },
          "id": 0,
          "name": "NEWOFFICE1"
        }
      ]
    }
  ],
  "id": 0,
  "name": "NEWCOMPANY2"
}

-----------------------------------------------------------------------------------------
PUT: http://localhost:8580/company

{
    "id": 19,
    "name": "NEWCOMPANY2-Updated",
    "departments": [
      {
        "id": 20,
        "name": "NEWDEPARTMENT1-Updated",
        "employees": [
          {
            "id": 22,
            "name": "NEWEMPNAME-Updated",
            "surname": "NEWEMPSURNAME",
            "address": {
              "id": 21,
              "street": "NEWSTREET1",
              "houseNumber": "NEWHOUSE1",
              "zipCode": "444444",
              "handler": {},
              "hibernateLazyInitializer": {}
            }
          }
        ],
        "offices": [
          {
            "id": 24,
            "name": "NEWOFFICE1-Updated",
            "address": {
              "id": 23,
              "street": "NEWSTREET2",
              "houseNumber": "NEWHOUSE2",
              "zipCode": "555555",
              "handler": {},
              "hibernateLazyInitializer": {}
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
