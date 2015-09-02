#rest-api-essentials BETA [0.0.2]

Basics for RESTFul APIs in a demystified way

##Features
*	**SecurityChain** - Simplified authorization and user roles check using *SecurityHelper* interface
*   **ExceptionHandlingFilter** - Annoying non-api exceptions won't be written within responses (empty *InternalServerError* instead)
*	**API Exceptions** - HTTP status: [*RFC2616*](http://tools.ietf.org/html/rfc2616) and [*RFC4918*](http://tools.ietf.org/html/rfc4918) compliance:
  * 400 - BadRequestException
  * 401 - UnauthorizedException
  * 402 - PaymentRequiredException
  * 403 - ForbiddenException
  * 404 - NotFoundException
  * 406 - NotAcceptableException
  * 407 - ProxyAuthenticationRequiredException
  * 408 - RequestTimeoutException
  * 409 - ConflictException
  * 410 - GoneException
  * 411 - LengthRequiredException
  * 412 - PreconditionFailedException
  * 413 - RequestEntityTooLargeException
  * 415 - UnsupportedMediaTypeException
  * 416 - RequestedRangeNotSatisfiableException
  * 417 - ExpectationFailedException
  * 422 - UnprocessableEntityException
  * 423 - LockedException
  * 424 - FailedDependencyException
  * 500 - InternalServerErrorException
  * 501 - NotImplementedException
  * 502 - BadGatewayException
  * 503 - ServiceUnavailableException
  * 504 - GatewayTimeoutException
  * 507 - InsufficientStorageException
  
##Usage
###SecurityChain
A SecurityChain requires an implementation of *SecurityHelper*

	SecurityHelper helper = MySecurityHelper();
	
	SecurityChain.of(helper).checkDenyAll()		//Optional
							.checkPermitAll()	//Optional
							.authorize()
							.checkAdmin()		//Optional
							.checkRoles();
							
###ExceptionHandlingFilter
Same as every *Filter* (Remember: This must be the first filter to be handled).
Within your **web.xml**

	<filter>
		<filter-name>ExceptionHandlingFilter</filter-name>
		<filter-class>org.wmoreira.api.core.exception.filter.ExceptionHandlingFilter</filter-class>
	</filter>

	<filter-mapping>
		<filter-name>ExceptionHandlingFilter</filter-name>
		<url-pattern>/*</url-pattern>
	</filter-mapping>
