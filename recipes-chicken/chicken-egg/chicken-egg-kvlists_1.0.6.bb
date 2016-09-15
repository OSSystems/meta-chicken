SECTION = "devel/chicken"
DESCRIPTION = "Provides keyword/value list (or key-value list, for short) operations."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://kvlists.meta;md5=a32a790d218de49fb218adf78f9dd4ed"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper chicken-egg-setup-helper-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-setup-helper-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/kvlists/kvlists-${PV}.tar.gz"

SRC_URI[md5sum] = "e28d4efc68a9e74dbe6d8f71b14533b7"
SRC_URI[sha256sum] = "f2ba739e3b3cd7a2c7dacfbad4ebf834b1041a0bcdc2976a875acde9e595a734"

S = "${WORKDIR}/kvlists-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
