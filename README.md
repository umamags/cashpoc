#CashPOC Readme
##How to start application.
1. In eclipse, right click on Application.java (under com.capg.accservices package) and Run as Java application.
This is a spring boot application and so will start with an embedded container tomcat on port 9090.

##Application Configuration
application.yml
This is where port and database configuration are setup

##How to test REST API.
1. Open chrome and go to chrome://apps
2. Install Postman if not already installed.
3. Use this Url:

http://localhost:8090/cashpoc/processMessageApi

Set protocol to POST.
Click on Body
Set it to raw. Paste this JSON underneathL

```
json
{
    "glossary": {
        "title": "example glossary 2",
		"GlossDiv": {
            "title": "S",
			"GlossList": {
                "GlossEntry": {
                    "ID": "SGML",
					"SortAs": "SGML",
					"GlossTerm": "Standard Generalized Markup Language",
					"Acronym": "SGML",
					"Abbrev": "ISO 8879:1986",
					"GlossDef": {
                        "para": "A meta-markup language, used to create markup languages such as DocBook.",
						"GlossSeeAlso": ["GML", "XML"]
                    },
					"GlossSee": "markup"
                }
            }
        }
    }
}
```
