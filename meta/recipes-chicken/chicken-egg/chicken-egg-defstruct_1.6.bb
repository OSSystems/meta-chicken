inherit chicken_install

SECTION = "devel/chicken"
DESCRIPTION = "A more convenient form of define-record"
DEPENDS_virtclass-cross += "chicken-cross"
DEPENDS += "chicken"

BBCLASSEXTEND = "cross"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://defstruct.meta;md5=890e39714035b57ded3dd7859ebe2741"
