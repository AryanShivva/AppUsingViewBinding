# AppUsingViewBinding

COMPLETE UNDERSTANDING OF VIEWBINDING CONCEPT IN KOTLIN(ANDROID STUDIO).

USE OF VIEWBINDING :

View binding is a feature that makes it easier to write code that interacts with views. Once view binding is enabled in a module, it generates a binding class for each XML layout file present in that module. An instance of a binding class contains direct references to all views that have an ID in the corresponding layout.

In most cases, view binding replaces findViewById.

APP : Opens with SignIn page and after SignIn you will be redirected into another page in our app.

Code :

    lateinit var binding :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //code for using binding
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.button.setOnClickListener {
            if(binding.checkBox.isChecked){
              val openSignInActivity = Intent(this, termsActivity::class.java)
                startActivity(openSignInActivity)
            }else{
                binding.checkBox.buttonTintList = ColorStateList.valueOf(Color.RED)
                Toast.makeText(this, "ACCEPT THE TERMS & CONDITIONS", Toast.LENGTH_SHORT).show()
            }
        }

    }
