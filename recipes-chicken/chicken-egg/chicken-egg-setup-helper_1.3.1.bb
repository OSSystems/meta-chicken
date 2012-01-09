inherit chicken_install

SECTION = "devel/chicken"
DESCRIPTION = "Installation/Setup Shortcut Routines"
DEPENDS_virtclass-cross += "chicken-cross"
DEPENDS += "chicken"

BBCLASSEXTEND = "cross"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://setup-helper.meta;md5=64b2b850a5157a85bf7c0d13d28a1f6c"
