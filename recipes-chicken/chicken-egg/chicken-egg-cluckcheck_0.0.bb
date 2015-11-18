SECTION = "devel/chicken"
DESCRIPTION = "A Chicken Scheme port of the QuickCheck unit test framework"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://cluckcheck.meta;md5=9b287f316b1c7c0f253862aa7aeb1c75"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/cluckcheck/cluckcheck-${PV}.tar.gz"

SRC_URI[md5sum] = "6292fe368c83419aae50a3071cf2370a"
SRC_URI[sha256sum] = "60b8bc389ec2c1cc9b6fce9aa05665669b37485d22bd2a670dc4853c4e77701c"

S = "${WORKDIR}/cluckcheck-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
