inherit chicken_install

SECTION = "devel/chicken"
DESCRIPTION = "Procedures to generate [X]HTML code"
DEPENDS_virtclass-cross += "chicken-cross"
DEPENDS += "chicken"

BBCLASSEXTEND = "cross"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://html-tags.meta;md5=23c93fa675a35ef527682a16e8cb7594"
