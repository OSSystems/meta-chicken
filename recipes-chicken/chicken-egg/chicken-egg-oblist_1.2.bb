SECTION = "devel/chicken"
DESCRIPTION = "Obtain list of all interned symbols and variables"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://oblist.meta;md5=6c21602d49e82e8011a73dbcd53a5e12"
DEPENDS_append_class-cross = " chicken-egg-regex-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-regex-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-regex chicken-egg-regex-crosssdk"
DEPENDS = " chicken-egg-regex chicken-egg-regex-cross"
RDEPENDS_${PN} = " chicken-egg-regex"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/oblist/oblist-${PV}.tar.gz"

SRC_URI[md5sum] = "8afd4376c9263768b9717c54c66405ce"
SRC_URI[sha256sum] = "05ca578e7529e6191b1e1f15cdfd9910d32a3d66ccc3502003bf125c6eea9f79"

S = "${WORKDIR}/oblist-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
