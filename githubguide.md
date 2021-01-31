to install and run jekyll
first install ruby and it's dependencies
then install jekyll.all details are present in jekyll site for respective os on their website.
after the installation create a folder and open it in a editor.
then run this 
```
jekyll new testblog
```
to use this website 
```
cd testblog
```
to just build the code run
```
jekyll build
```

then build and start webserver, run
```
jekyll serve
```


1.**liquid** 
is a templating jekyll uses for making static sites faster to generate.

2. **yaml**:yet another markup language/yaml ain't a markup language

yaml is a serialization language
i.e standard format to transfer data to other entities

- human readable and intuitive
- this is done with line separation and indentation
- used at configuration many latest tools on the internet for settings,customizations.

Syntax:

1. **Key-value pairs**: in yaml we store data with key- value pairs,a space between key and value is mandatory.
2. can use strings normally,inside single quotes,inside double quotes
3. we use # to comment our code in yaml
4. objects are groups of related key-value pairs.We have to indent the data inside our object.
5. we can have lists in yaml using - inside the object
6. the key-value pairs can store,string,numbers,boolean.
7. boolean values are stored in two way true/false,yes/no
8. can put simple data types in a [ ] for easy understanding.
9. to store given string in multi lines with given indentation we use |, to store given string single line or multi line in a single line we use >
10. to use environmental variables we use $ sign.here we can take the env var into our yaml for data checks etc.
11. placeholders are used to work with variables.here we use {{ variable name }}
12. to store multiple yaml documents in a single yaml file we separate them using --- at the start and --- at the end.
13. 
```yaml
key: value
key: value
key: value
# ex
app: user-authentication
version: 1
author: me


objectname:
    key: value
    key: value
    
    
objectname:
# lists example
    - someapp: 1234
        port: 234
        version: 23.3
        
object:
    key: value
    # both are valid
    isWorking: yes
    isWorking: true
    
    # valid
version: [1,2.3,3,4.2]
```

3. **to edit the config of jekyll go to config yaml file**
4. **front matter** contains the data that can be used to provide metadata useful information to our html page using jekyll
5. **create blogs** we store all blogs in posts folder and that will be updated to html by jekyll
