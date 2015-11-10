SECTION = "devel/chicken"
DESCRIPTION = "Installation/Setup Shortcut Routines"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://setup-helper.meta;md5=daf5ef3d9c531d2f70f0140f11daac33"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/setup-helper/setup-helper-${PV}.tar.gz"

SRC_URI[md5sum] = "709c9950ae57429c644bcefb07c427cf"
SRC_URI[sha256sum] = "a7270d69e47ee0eec1b78e8d37bf1fa4d2e5bbb4ee96465cff43abf66487fd06"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
