SECTION = "devel/chicken"
DESCRIPTION = "Partial evaluator for the Scheme0 language."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://scheme0-pe.meta;md5=22f6864427811ecd8ff2727881ff8570"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/scheme0-pe/scheme0-pe-${PV}.tar.gz"

SRC_URI[md5sum] = "fa5e5e9caaa40e2d1f649d756572d9ee"
SRC_URI[sha256sum] = "eaae1dc062226de8652d06e4d279789e64a09b84045901949d25d46ca460a255"

S = "${WORKDIR}/scheme0-pe-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
