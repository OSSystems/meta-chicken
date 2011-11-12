inherit chicken_install

SECTION = "devel/chicken"
DESCRIPTION = "Secure password hashing through the Unix crypt() function"
DEPENDS_virtclass-cross += "chicken-cross"
DEPENDS += "chicken"

BBCLASSEXTEND = "cross"

LICENSE = "Public Domain"
LIC_FILES_CHKSUM = "file://crypt.meta;md5=fed18e44b5d9d5abf1ab1d7aae2b8c1e"
