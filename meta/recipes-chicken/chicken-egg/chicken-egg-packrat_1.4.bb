inherit chicken_install

SECTION = "devel/chicken"
DESCRIPTION = "A packrat parsing library"
DEPENDS_virtclass-cross += "chicken-cross"
DEPENDS += "chicken"

BBCLASSEXTEND = "cross"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://packrat.meta;md5=550acbffd916621243ab37e1be1dbb82"
