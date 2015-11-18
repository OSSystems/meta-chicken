SECTION = "devel/chicken"
DESCRIPTION = "Describe coops (and regular) objects in detail"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://describe-coops.meta;md5=5d9b647539c83ef195a75fc279063a73"
DEPENDS_append_class-cross = " chicken-egg-describe-cross chicken-egg-coops-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-describe-crosssdk chicken-egg-coops-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-describe nativesdk-chicken-egg-coops chicken-egg-describe-crosssdk chicken-egg-coops-crosssdk"
DEPENDS = " chicken-egg-describe chicken-egg-coops chicken-egg-describe-cross chicken-egg-coops-cross"
RDEPENDS_${PN} = " chicken-egg-describe chicken-egg-coops"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/describe-coops/describe-coops-${PV}.tar.gz"

SRC_URI[md5sum] = "557d90285626e1bc69f0ba62053db2e8"
SRC_URI[sha256sum] = "001bccbfc2e072657cc9072bbcdc0c8b9c9856f74cfad7957bb123acef313438"

S = "${WORKDIR}/describe-coops-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
